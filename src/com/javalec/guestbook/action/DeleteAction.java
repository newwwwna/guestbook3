package com.javalec.guestbook.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;
import com.javalec.guestbook.web.Action;

public class DeleteAction implements Action{

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String no = request.getParameter("no");
		String password = request.getParameter("pw");

		if (password != null || no != null) {
			int id = Integer.parseInt(no);
			GuestBookDAO dao = new GuestBookDAO();
			GuestBookVO vo = new GuestBookVO();

			vo.setNo(id);
			vo.setPassword(password);

			dao.delete(vo);
		}

		response.sendRedirect("gb");
	
	
	}
	
}
