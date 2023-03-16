package prob.oop.advanced;

public abstract class Display {
	public abstract int getColumns();		// 가로의 문자 수를 리턴
	public abstract int getRows();			// 세로의 줄 수를 리턴
	public abstract String getRowText(int row); // row번째의 문자열을 리턴
	public final void show() {	// 모두 표시한다
		int rows = getRows();
		for(int i=0; i<rows; i++) {
			System.out.println(getRowText(i));
		}
	}
}
