import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "NumberGuessServlet", urlPatterns = "/guess")
public class NumberGuessServlet extends HttpServlet {
    Random random = new Random();
    int randomNumber = random.nextInt(3) + 1;



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testing my work, the randomNumber is: " + randomNumber);
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //when the user clicks submit, it sends them to this servlet that we're in right now...
        int number = Integer.parseInt(request.getParameter("number")); //number is what I named the input field in the guess.jsp file
        System.out.println("testing my work, the user's number is: " + number);

        //if the user's guess matches the randomNumber, then we need to send them to the "you win" message
        //else we need to send them to the "you lose" message
        if(number == randomNumber){
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }

}
