package com.sds.icto.mysite.action.bulletin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.BulletinDao;
import com.sds.icto.mysite.dao.GuestBookDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.BulletinBoard;
import com.sds.icto.mysite.vo.GuestBook;

public class BulletinDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		BulletinDao dao = new BulletinDao();
		
		String no = request.getParameter("b_no");
		dao.deleteById(Integer.parseInt(no));
		response.sendRedirect("bulletin?a=bulletinMain");
	}

	
	
}
