package com.javalec.guestbook.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.guestbook.web.Action;

public class UpdateConAction implements Action{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("password").equals(request.getParameter("pw"))) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/updateform2.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("gb");
		}
		
		
		
		
		
	}
	
	
}
