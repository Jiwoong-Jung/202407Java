package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardService;
import command.CommandHandler;

public class ListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse res) {
		String tmp = request.getParameter("page");
        int pageNo = (tmp != null && tmp.length() > 0)
                ? Integer.parseInt(tmp) : 1;

        request.setAttribute("msgList",
                new BoardService().getMsgList(pageNo));
        request.setAttribute("pgnList",
                new BoardService().getPagination(pageNo));
		return "/WEB-INF/view/list.jsp";
	}

}
