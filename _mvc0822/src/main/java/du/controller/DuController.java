package du.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import du.db.MemberDao;
import du.db.MemberDto;

/**
 * Servlet implementation class DuController
 */
@WebServlet("/")
public class DuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DuController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String view = null;
		// URL에서 프로젝트 이름 뒷 부분의 문자열 얻어내기
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		if (com.equals("/")) {
			view = "main.jsp";
		} else if (com.equals("/loginForm")) {
        	view = "/sign-in/loginForm.jsp";
        } else if (com.equals("/login")) {
        	request.setCharacterEncoding("utf-8");
        	String email = request.getParameter("email");
            String password = request.getParameter("password");
            System.out.println(email+", "+password);
            MemberDto memberDto = new MemberDto(0, "", email, password, "");
            MemberDao memberDao = new MemberDao();
            int login = memberDao.isMember(memberDto);
            if (login == 1) {
            	System.out.println("로그인 성공!");
            	memberDto = memberDao.findMember(memberDto);
            	System.out.println(memberDto);
            	HttpSession session = request.getSession();    //세션 객체 가져오기
            	session.setAttribute("customInfo", memberDto);  //세션에 값 담기
            	request.setAttribute("userLoggedIn", true);
            } else {
            	System.out.println("로그인 실패!");
            }
            view = "main.jsp";
        }
		
		// view에 담긴 문자열에 따라 포워딩 또는 리다이렉팅
		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
