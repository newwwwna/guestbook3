package com.javalec.el.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.el.vo.MemberVO;

@WebServlet("/04")
public class _04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO memberVo2 = new MemberVO();
		memberVo2.setNo( 2L );
		memberVo2.setEmail( "kickcar2@gmail.com " );
		memberVo2.setName( "강호동" );
		request.setAttribute( "memberVo2" , memberVo2 );

		MemberVO memberVo3 = new MemberVO();
		memberVo3.setNo( 3L );
		memberVo3.setEmail( "kickcar3@gmail.com " );
		memberVo3.setName( "도우넛" );
		request.getSession( true ).setAttribute( "memberVo3", memberVo3 );

		MemberVO memberVo4 = new MemberVO();
		memberVo4.setNo( 4L );
		memberVo4.setEmail( "kickcar4@gmail.com " );
		memberVo4.setName( "마이콜" );
		request.getServletContext().setAttribute( "memberVo4", memberVo4 );
		
		request.getRequestDispatcher( "/view/04.jsp" ).forward( request, response );
	}
}
