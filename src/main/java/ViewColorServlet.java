import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        request.setAttribute("color", color);         //why do we have to set the attribute in both servlets? //I think because in pickcolor, it's only setting the attribute for the pick color servlet, and here's it's setting the attribute for the viewcolor servlet
        request.getRequestDispatcher("viewcolor.jsp").forward(request, response);
    }



}
