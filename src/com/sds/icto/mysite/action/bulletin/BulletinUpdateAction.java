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

public class BulletinUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		BulletinDao dao = new BulletinDao();
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String b_no = request.getParameter("b_no");
		
		
		System.out.println(title);
		System.out.println(content);
		BulletinBoard b = new BulletinBoard();
		b.setB_no(Integer.parseInt(b_no));
		b.setContent(content);
		b.setB_title(title);
		
		dao.updateBoard(b);

		response.sendRedirect("bulletin?a=bulletinDetail&no="+Integer.parseInt(b_no));
	}

}
