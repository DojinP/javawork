package jdbc.dao;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("=               인사관리시스템               =");
		System.out.println("==========================================");
		System.out.println("1. 사원등록");
		System.out.println("2. 전체사원조회");
		System.out.println("3. 사원정보수정");
		System.out.println("4. 사원삭제(퇴사)");
		System.out.println("5. 주소로 사원 검색");
		System.out.println("6. 로그인");
		System.out.println("7. 사원정보조회");
		System.out.println("==========================================");
		System.out.print("원하시는 작업을 선택하세요. : ");
		int choice = sc.nextInt();
		show(choice);
	}

	private static void show(int choice) {
		MenuUI ui = new MenuUI();
		switch(choice) {
		case 1:
			ui.insertMenu();
			break;
		case 2:
			break;
		case 3:
			ui.updateMenu();
			break;
		case 4:
			ui.deleteMenu();
			break;
		case 5:
			ui.selectMenu();
			break;
		case 6:
			ui.login();
			break;
		case 7:
			break;
		}
	}
}