import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
            for (int i = 0; i < meattopping.length; i++) {
                System.out.println("Meat Toppings: " + meattopping[i]);
            }

        String[] veggietopping = request.getParameterValues("veggietopping");
        for (int i = 0; i < veggietopping.length; i++) {
            System.out.println("Meat Toppings: " + veggietopping[i]);
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

        System.out.println("crust: " + crust + " sauce type: " + sauce + " " + " sauce amount: " + sauceAmount + " Meat Toppings: " + meattopping + " "
                + "Veggie Toppings: " + veggietopping + " " + "size: " + size + " " + "Address: " + address);
        response.sendRedirect("/pizza-order");

    }
}