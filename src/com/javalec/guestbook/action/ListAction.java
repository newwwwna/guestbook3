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

public class ListAction implements Action {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GuestBookDAO dao = new GuestBookDAO();

		String keyword = request.getParameter("search");
		List<GuestBookVO> list = null;
		String select = request.getParameter("select");

		if (keyword != null) {

			if (select.equals("name")) {
				list = dao.nameSearch(keyword);
			} else {
				list = dao.search(keyword);
			}
		} else {
			list = dao.getGuestBookList();
		}

		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		rd.forward(request, response);

	}
}
