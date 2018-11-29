package com.javalec.guestbook.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;
import com.javalec.guestbook.web.Action;

public class UpdateAction implements Action{

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		String name = request.getParameter("name2");
		String content = request.getParameter("content2");
		String password = request.getParameter("pw");

		if (no != null) {
			int id = Integer.parseInt(no);
			GuestBookDAO dao = new GuestBookDAO();
			GuestBookVO vo = new GuestBookVO();
			vo.setNo(id);
			vo.setName(name);
			vo.setContent(content);
			vo.setPassword(password);

			dao.update(vo);
		}

		response.sendRedirect("gb");
		
		
		
	}
	
}
