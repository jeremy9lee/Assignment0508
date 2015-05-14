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

public class BulletinFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		BulletinDao dao = new BulletinDao();
		
		System.out.println("들어옴");
		ArrayList<BulletinBoard> list = (ArrayList<BulletinBoard>) dao.selectAllList(0);
		ArrayList<BulletinBoard> listByAdmin = (ArrayList<BulletinBoard>) dao.selectAllList(1);
		
		request.setAttribute("list", list);
		request.setAttribute("listByAdmin", listByAdmin);
		request.getRequestDispatcher("views/board/bulletinBoard.jsp").forward(request, response);
	}

	
	
}
