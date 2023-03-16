package chap06.oop.basic;
// 인스턴스변수와 클래스변수의 비교
// 인스턴스변수 -> 객체가 소유하는 변수(객체변수)
// 클래스변수 -> 모든 객체가 공유해서 사용하는 변수(정적변수)
public class StaticDemo {
	int num;
	static int staticNum;
	public StaticDemo() {
		num++; // num = num + 1;
		staticNum++; // staticNum = staticNum
	}
	
	public void display() {
		System.out.println("num : " + num + ", staticNum : " + staticNum);
	}

}
