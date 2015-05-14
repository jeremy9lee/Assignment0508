package com.sds.icto.mysite.action.bulletin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sds.icto.mysite.dao.BulletinDao;
import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.BulletinBoard;

public class BulletinWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		BulletinDao dao = new BulletinDao();
		
		
		String memberNo = request.getParameter("sessionNo");
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		
		System.out.println(memberNo);
		
		dao.insert(new BulletinBoard(0, Integer.parseInt(memberNo), title, name, content, null, 0));
		request.setCharacterEncoding("utf-8");
		response.sendRedirect("bulletin?a=bulletinMain");
	}

}
