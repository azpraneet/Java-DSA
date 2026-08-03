package com.emsApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.emsApp.model.DBservice;
import com.emsApp.model.DBserviceImpl;

@WebServlet("/verifyLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
       
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DBserviceImpl service = new DBserviceImpl();
		service.conectDB();
		boolean status = service.verifylogin(email, password);
		if (status) {
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/registration.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("error", "invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
