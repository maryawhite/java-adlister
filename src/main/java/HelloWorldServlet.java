import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int hitCount;

    public void init(){
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        hitCount++;
        String searchQuery = req.getParameter("q");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, World!</h1>");

        if(searchQuery != null){
            out.println("<p>Here are your results for " + searchQuery + "</p>");
        }
        if (searchQuery == "resetcounter"){
            hitCount = 0;
        }

        String nameQuery = req.getParameter("name");
        if(nameQuery != null) {
            out.println("<h1>Hello, " + nameQuery + "</h1>");
        }
        String hits = "Total number of hits";
        out.println(hits + " " + hitCount);

    }
}
