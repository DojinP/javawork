package prob.string;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "�Է� ���� = " + number );		
		System.out.println("2 Ƚ�� => " + fn.countNumber(number, 2));//3�� ����
		System.out.println("4 Ƚ�� => " + fn.countNumber(number, 4));//2�� ����
	}
	
	/*  이곳에 countNumber 메소드를 작성하십시오. */
	
}
