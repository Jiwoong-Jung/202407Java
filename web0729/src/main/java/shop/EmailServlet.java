package shop;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        Cookie emailCookie = new Cookie("email", email);
        emailCookie.setMaxAge(60 * 60 * 24 * 7); // 1 week
        response.addCookie(emailCookie);
        response.sendRedirect("email.jsp");
    }
}
