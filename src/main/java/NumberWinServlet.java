import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NumberWinServlet", urlPatterns = "/correct")
public class NumberWinServlet extends HttpServlet {
    String message = "You Win!";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getParameter("message");   //These 2 lines go here in the doGet, not in the doPost
        request.setAttribute("message", message);

        request.getRequestDispatcher("/guessoutcome.jsp").forward(request, response);
    }


}
