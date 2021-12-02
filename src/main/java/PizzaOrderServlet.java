import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String crust = request.getParameter("crust_preference");
        System.out.println("crust type: " + crust);
        String sauce = request.getParameter("sauce_type_preference");
        System.out.println("sauce: " + sauce);
        String sauceAmount = request.getParameter("sauce_amount_preference");
        System.out.println("sauce amount: " + sauceAmount);

        String[] meattopping = request.getParameterValues("meattopping");  //the string meattopping matches the name in the input in the jsp file
        System.out.println("Meat Toppings: ");
        if(meattopping != null){      //when this if statement wasn't here, if the user didn't select any toppings it would cause a null pointer error
            for (int i = 0; i < meattopping.length; i++) {
                System.out.println(meattopping[i]);
            }
        } else {
            System.out.println("no meat");
        }


        String[] veggietopping = request.getParameterValues("veggietopping");
        System.out.println("Veggie Toppings: ");
        if(veggietopping != null){
            for (int i = 0; i < veggietopping.length; i++) {
                System.out.println(veggietopping[i]);
            }
        } else {
            System.out.println("no veggies");
        }


        String size = request.getParameter("size");
        System.out.println("size: " + size);
        String address = request.getParameter("address");
        System.out.println("delivery address: " + address);
//        response.getWriter().println("<p>crust " + crust + " sauce " + sauce + " " + sauceAmount + " Toppings: " + meattoppings + " "
//                + veggietoppings + " size " + size + " Address " + address + "</p>");



//        request.setAttribute("crust", crust);
//        request.setAttribute("sauce", sauce);
//        request.setAttribute("sauceAmount", sauceAmount);
//        request.setAttribute("meattopping", meattopping);
//        request.setAttribute("veggietopping", veggietopping);
//        request.setAttribute("size", size);
//        request.setAttribute("address", address);

        System.out.println("Crust: " + crust + " Sauce type: " + sauce + " " + " Sauce amount: " + sauceAmount + " Meat Toppings: " + Arrays.toString(meattopping) + " "
                + "Veggie Toppings: " + Arrays.toString(veggietopping) + " " + "Size: " + size + " " + "Address: " + address);

        response.sendRedirect("/pizza-order");

    }
}