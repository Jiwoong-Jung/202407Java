package drive;

import board.BoardDAO;
import board.BoardDTO;

public class Ex3 {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.getOne(12);
		System.out.println(dto);

	}

}
