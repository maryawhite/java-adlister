import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet(name = "HelloServlet", urlPatterns = "/hello")
    public class HelloServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String name = request.getParameter("name");
            // if the name is null, it means that "name" was not present in the query
            // string, and here we'll provide a default value
            if (name == null) {
                name = "World!";
            } else if (name.equals("bgates")) {
                response.sendRedirect("https://microsoft.com");
                return;
            }
            // pass the value of the name variable to the view, and send the request
            // forward to the hello.jsp file
            request.setAttribute("name", name);
            request.getRequestDispatcher("/hello.jsp").forward(request, response);  //the jsp file needs to match the jsp file that you want to use
        }
    }

//    http://localhost:8080/hello?name=Mary
