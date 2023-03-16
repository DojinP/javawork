package api.util.collection;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayListExam03_Student_DTO {
	public static void main(String[] args) {
		System.out.println("번호\t성명\t국어\t수학\t영어");
		
		Student student1 = new Student(1, "장동건", 100, 98, 88);
		Student student2 = new Student(2, "이민호", 89, 100, 100);
		Student student3 = new Student(3, "김범룡", 95, 89, 100);
		
		// 3개의 Student 객체를 ArrayList에 저장
		ArrayList<Student> stdlist = new ArrayList<Student>();
		stdlist.add(student1);
		stdlist.add(student2);
		stdlist.add(student3);
		
		// 출력
		
		for(int i=0; i<stdlist.size(); i++) {
			Student std = stdlist.get(i);
			System.out.print(std.getNum() + "\t");
			System.out.print(std.getName() + "\t");
			System.out.print(std.getKor() + "\t");
			System.out.print(std.getMath() + "\t");
			System.out.print(std.getEng() + "\t");
			System.out.println(std.getRegdate() + "\t");
		}
		
		System.out.println("==================================================================================");
		
		display(stdlist);
	}

	private static void display(ArrayList<Student> stdlist) {
		for(int i=0; i<stdlist.size(); i++) {
			Student std = stdlist.get(i);
			System.out.print(std.getNum() + "\t");
			System.out.print(std.getName() + "\t");
			System.out.print(std.getKor() + "\t");
			System.out.print(std.getMath() + "\t");
			System.out.print(std.getEng() + "\t");
			System.out.println(std.getRegdate() + "\t");
		}
	}
}
