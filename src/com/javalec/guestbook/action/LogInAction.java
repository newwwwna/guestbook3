package com.javalec.guestbook.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.guestbook.web.Action;

public class LogInAction implements Action{
@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	HttpSession session = request.getSession();
	
	String id = request.getParameter("id");
	session.setAttribute("id", id);
	
	String password = request.getParameter("password");
	session.setAttribute("password", password);
	
	response.sendRedirect("gb");
	
}


}
