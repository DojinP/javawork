package chap05;

import java.util.Scanner;

public class Chap05_Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean state = true;
		int select;
		String input = "";
		int student_count = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		while (state) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");

			System.out.print("선택>");
			input = sc.nextLine();
			select = Integer.parseInt(input);

			switch (select) {
			case 1:
				System.out.print("학생수>");
				input = sc.nextLine();
				student_count = Integer.parseInt(input);
				scores = new int[student_count];
				for(int i=0; i<scores.length; i++) {
					scores[i] = 0;
				}
				break;
			case 2:
				if(student_count == 0) {
					System.out.println("학생 수 입력이 필요합니다.");
					break;
				}else {
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores["+i+"]: ");
						input = sc.nextLine();
						scores[i] = Integer.parseInt(input);
					}
				}
				break;
				
			case 3:
				if(student_count == 0) {
					System.out.println("학생 수 입력이 필요합니다.");
					break;
				}else {
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]: " + scores[i]);
					}
				}
				break;
			case 4:
				if(student_count == 0) {
					System.out.println("학생 수 입력이 필요합니다.");
					break;
				}else {
					for(int i=0; i<scores.length; i++) {
						if(max < scores[i]) {
							max = scores[i];
						}
						sum += scores[i];
					}
					avg = sum / scores.length;
					
					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + avg);
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				state = false;
				break;
				default:
					System.out.println("잘못된 입력");
			}
		}
		
		sc.close();

	}
}
