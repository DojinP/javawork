package api.util.collection;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayListExam03 {
	public static void main(String[] args) {
		/*
		 * 번호	성명		국어		수학		영어
		 * 
		 *  1	장동건	100		99		88
		 *  2	이민호	89		100		100
		 *  3	김범룡	95		89		100
		 *  
		 *  
		 *  	ArrayList<ArrayList<String>>
		 *  	=> ArrayLisy에 저장된 ArrayList
		 *  => 제목 빼고 데이터만 ArrayList에 저장하기
		 */
		
		// 1. 데이터를 ArrayList에 저장
		// 2. ArrayList에 저장된 모든 데이터를 위와 같은 형식으로 출력하기
		//  => 1, 2번이 끝나면 제출
		
		// 3. 출력하는 부분만 메소드로 정의해서 사용하기
		// 메소드명 : display
		// 리턴타입은 void
		// 매개변수 : ArrayList<ArrayList<String>>
		
		// 초기화
		ArrayList<ArrayList<String>> dbArr = new ArrayList<ArrayList<String>>();
		
		for(int i=0; i<3; i++) {
			dbArr.add(new ArrayList<String>());
		}
		
		// 데이터 저장
		StringTokenizer[] data = new StringTokenizer[3];
		data[0] = new StringTokenizer("1\t장동건\t100\t99\t88", "\t");
		data[1] = new StringTokenizer("2\t이민호\t89\t100\t100", "\t");
		data[2] = new StringTokenizer("3\t김범룡\t95\t89\t100", "\t");
		
		for(int i=0; i<3; i++) {
			while(data[i].hasMoreTokens()) {
				String token= data[i].nextToken();
				dbArr.get(i).add(token);
			}
		}
		
		// 출력
		display(dbArr);
	}
	
	public static void display(ArrayList<ArrayList<String>> dbArr) {
		// 출력
		System.out.println("번호\t성명\t국어\t수학\t영어");
		
		for(int i=0; i<dbArr.size(); i++) {
			for(int j=0; j<dbArr.get(i).size(); j++) {
				System.out.print(dbArr.get(i).get(j) + "\t");
			}
			System.out.println();
		}
	}
}
