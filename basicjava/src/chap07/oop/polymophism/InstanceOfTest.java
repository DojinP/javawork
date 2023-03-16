package chap07.oop.polymophism;

import prob.chap07.*;

public class InstanceOfTest {
	public static void main(String[] args) {
		Beverage obj = new Coffee("아메리카노");
		Beverage obj2 = new Tea("케모마일");
		Coffee obj3 = new Coffee("케모마일");
		String str = new String("Java");
		
		// 객체의 타입을 확인 - instanceof
		
		if(obj3 instanceof Beverage)	{ // - obj가 참조하는 객체가 Beverage 타입인지 검사
			System.out.println("Beverage 타입");
		}else {
			System.out.println("Beverage 타입 아님");
		}
		
		if(obj3 instanceof Coffee)	{ // - obj가 참조하는 객체가 Coffee 타입인지 검사
			System.out.println("Coffee 타입");
		}else {
			System.out.println("Coffee 타입 아님");
		}
		
//		if(obj3 instanceof Tea)	{ // - obj가 참조하는 객체가 Tea 타입인지 검사
//			System.out.println("Tea 타입");
//		}else {
//			System.out.println("Tea 타입 아님");
//		}
	}
}
