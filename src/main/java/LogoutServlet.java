import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().invalidate();

//        request.getRequestDispatcher("/login.jsp").forward(request, response); //DO NOT USE THIS HERE!!!

        response.sendRedirect("/login");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //after the user logs in and they are on the profile page, they can click logout and it will log them out. the button is on the profile.jsp and the action is /logout
        // this works ok, but there's an additional step that would need to be done to prevent the user from clicking the back arrow and going back to their profile.
        request.getSession().invalidate();

        response.sendRedirect("/login");
    }
}
