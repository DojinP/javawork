package jdbc.exam.board;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardVO board);
//	int insert(String id, String title, String content);
	int update(String id, int boardNum, String title, String content);
	int delete(int boardNum);
	ArrayList<BoardVO> select();
	BoardVO read(int boardNum);
	ArrayList<BoardVO> search(String title);
}
