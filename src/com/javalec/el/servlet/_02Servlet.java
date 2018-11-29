package com.javalec.el.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/02")
public class _02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iValue = 10;
		float fValue = 3.14f;
		
		request.setAttribute( "iVal", iValue );
		request.setAttribute( "fVal", fValue );
		
		request.getRequestDispatcher( "/view/02.jsp" ).forward( request, response );
	}
}
