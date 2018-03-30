package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import models.User;

public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		HttpSession session = request.getSession();
		
		String nextPage = "register.jsp";

		String user_name = request.getParameter("user_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
				
		User user = new User(user_name,email,password);

		if(user.registerUser()){
			nextPage = "profile.jsp";
			session.setAttribute("user",user);
		}
			
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}