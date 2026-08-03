package p;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// URL mapping is /hello
@WebServlet("/hello")
public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // Print message on **server console**
        System.out.println("Hello from servlet! Printed on server console.");

        // Print response in browser
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Hello! Check server console for a message.");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
