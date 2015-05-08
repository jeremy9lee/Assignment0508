package com.sds.icto.mysite.action.guestbook;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.GuestBookDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.GuestBook;

public class GuestBookDeleteFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		GuestBookDao dao = new GuestBookDao();
		
		GuestBook gb = dao.search(Integer.parseInt(id));
		
		request.setAttribute("no", gb.getNo());
		request.getRequestDispatcher("/views/guestbook/deleteform.jsp").forward(request, response);
	
	}

	
	
}
