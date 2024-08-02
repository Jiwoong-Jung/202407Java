package driver;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {

	public static void main(String[] args) {
		BoardDTO dto = new BoardDTO(17, "최하나2", "최의 글 제목2", "최의 글 내용2", null, 0);
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(dto);
		
	}

}
