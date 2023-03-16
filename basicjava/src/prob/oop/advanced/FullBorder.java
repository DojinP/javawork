package prob.oop.advanced;

public class FullBorder extends Border {

	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return display.getRows() + 2;
	}

	@Override
	public String getRowText(int row) {
		if (row == display.getRows()) {
			return "|"+ display.getRowText(0) + "|"; 
		} else if (row == 0 || row == display.getRows() + 1) {
			return makeLine('-', display.getColumns());
		}
		return "";
	}

	public String makeLine(char ch, int count) {
		String ret = "";
		for(int i=0; i<count; i++) {
			ret += ch;
		}
		return "+" + ret + "+";
	}

}
