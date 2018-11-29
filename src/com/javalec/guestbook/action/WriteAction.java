package com.javalec.guestbook.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;
import com.javalec.guestbook.web.Action;

public class WriteAction implements Action{

public void execute(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		
	String name = request.getParameter("name");
	String pw = request.getParameter("pw");
	String content = request.getParameter("content");

	if (name != null || pw != null || content != null) {
		GuestBookDAO dao = new GuestBookDAO();
		GuestBookVO vo = new GuestBookVO();

		vo.setName(name);
		vo.setPassword(pw);
		vo.setContent(content);
		dao.insert(vo);
	}
	response.sendRedirect("gb");
		
		
	}
	
	
	
}
