package com.javalec.guestbook.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.guestbook.web.Action;

public class DeleteFormAction implements Action{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
		rd.forward(request, response);

	}
}
