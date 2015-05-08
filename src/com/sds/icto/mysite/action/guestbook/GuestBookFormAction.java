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

public class GuestBookFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		GuestBookDao dao = new GuestBookDao();
		
		System.out.println("들어옴");
		ArrayList<GuestBook> list = (ArrayList<GuestBook>) dao.selectAllList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("/views/guestbook/list.jsp").forward(request, response);
	}

	
	
}
