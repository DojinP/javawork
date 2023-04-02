package jdbc.exam.board;

public interface BoardDAO {
	int insert(String id, String title, String content);
	int update(String id, int boardNum, String title, String content);
	int delete(int boardNum);
	void search(String title);
	void read(int boardNum);
}
