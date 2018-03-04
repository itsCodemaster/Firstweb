package com.newwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

		
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		  String username= req.getParameter("user");
		  String password= req.getParameter("pass");
		  if(password.equals("admin"))
		  {
			  RequestDispatcher rd =req.getRequestDispatcher("servlet2");
			  rd.forward(req, resp);
		  }
		  else
		  {
			  out.print("sorry Invalid Password");
			 RequestDispatcher rd= req.getRequestDispatcher("index.html");
			 rd.include(req, resp);
		  }
	  }	
		
	}


