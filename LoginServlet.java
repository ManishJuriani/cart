package controllers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import java.io.IOException;

import models.User;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		HttpSession session = request.getSession();

		String nextPage = "login.jsp";

		String email = request.getParameter("email");
		String password= request.getParameter("password");

		User user = new User(email,password);
		if(user.loginUser()){
			user.setPassword(null);
			session.setAttribute("user",user);
			nextPage = "profile.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	
	}
}