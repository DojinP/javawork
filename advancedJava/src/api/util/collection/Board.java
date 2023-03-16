package api.util.collection;

import java.util.Date;

public class Board {
	private int num;
	private String name;
	private String title;
	private Date date;
	private String content;
	
	public Board(int num, String name, String title, String content) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.date = new Date();
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Board ["+ num + ", " + name + ", " + title + ", " +
						date + ", " + content + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
