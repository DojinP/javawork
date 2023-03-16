package chap07.oop.polymophism;
//기존의 사용하는 클래스 - 기능들
//잘 유지되고 있는 기능들
public class SenderLogic {
	// Sender 관련된 기능을 호출해서 처리하는 메소드
	public void run(Sender obj) {
		obj.send();
	}
	public void exe(Sender obj) {
		obj.send();
		obj.send();
	}
}
