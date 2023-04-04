package jdbc.exam.board;

import java.sql.Date;

public class BoardVO {
	private int boardNum;
	private String id;
	private String title;
	private String content;
	private Date writeDate;
	private int hit;
	
	public BoardVO() {
		
	}
	
	public BoardVO(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public BoardVO(int boardNum, String id, String title, String content, Date writeDate, int hit) {
		this(id, title, content);
		this.boardNum = boardNum;
		this.writeDate = writeDate;
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
