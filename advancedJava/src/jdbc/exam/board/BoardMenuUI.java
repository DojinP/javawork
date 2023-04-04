package jdbc.exam.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.nextLine();
		System.out.print("제목:");
		String title = key.nextLine();
		System.out.print("내용:");
		String content = key.nextLine();
		//여기에서 BoardDAO의 메소드를 호출하세요
//		int result = dao.insert(id, title, content);
		BoardVO board = new BoardVO(id, title, content);
		int result = dao.insert(board);
		if(result > 0) {
			System.out.println("게시글 등록 완료");
		}else {
			System.out.println("게시글 등록 실패");
		}
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.nextLine();
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		key.nextLine();
		System.out.println("*******수정할 내용 입력********");
		System.out.print("제목:");
		String title = key.nextLine();
		System.out.print("내용:");
		String content = key.nextLine();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.update(id, boardNum, title, content);
		if(result > 0) {
			System.out.println("게시글 수정 완료");
		}else {
			System.out.println("게시글 수정 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.delete(boardNum);
		if(result > 0) {
			System.out.println("게시글 삭제 완료");
		}else {
			System.out.println("게시글 삭제 실패");
		}
	}
	
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardVO> boardList = dao.select();
		
		int size = boardList.size();
		if(size == 0) {
			System.out.println("게시글이 존재하지 않습니다.");
		}else {
			System.out.println("글번호\t아이디\t제목\t작성일자\t\t조회수");
			for(int i=0; i<size; i++) {
				BoardVO board = boardList.get(i);
				System.out.print(board.getBoardNum()+"\t");
				System.out.print(board.getId()+"\t");
				System.out.print(board.getTitle()+"\t");
				System.out.print(board.getWriteDate()+"\t");
				System.out.println(board.getHit());
			}
		}
	}
	
	public void readMenu(){
		System.out.println("*******게시글상세조회********");
		System.out.print("글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		BoardVO board = dao.read(boardNum);
		if(board != null) {
			System.out.println("아이디 : " + board.getId());
			System.out.println("제목 : " + board.getTitle());
			System.out.println("작성일자 : " + board.getWriteDate());
			System.out.println("조회수 : " + board.getHit());
			System.out.println("내용 : \n" + board.getContent());
		}else {
			System.out.println("게시글이 존재하지 않습니다.");
		}
	}
	
	public void searchMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.nextLine();
		//여기에서 BoardDAO의 메소드를 호출하세요
		ArrayList<BoardVO> boardList = dao.search(title);
		int size = boardList.size();
		if(size == 0) {
			System.out.println("게시글이 존재하지 않습니다.");
		}else {
			System.out.println("글번호\t아이디\t제목\t작성일자\t\t조회수");
			for(int i=0; i<size; i++) {
				BoardVO board = boardList.get(i);
				System.out.print(board.getBoardNum()+"\t");
				System.out.print(board.getId()+"\t");
				System.out.print(board.getTitle()+"\t");
				System.out.print(board.getWriteDate()+"\t");
				System.out.println(board.getHit());
			}
		}
	}
}
