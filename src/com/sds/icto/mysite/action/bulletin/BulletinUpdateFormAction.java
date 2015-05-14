package com.sds.icto.mysite.action.bulletin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sds.icto.mysite.dao.BulletinDao;
import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.BulletinBoard;

public class BulletinUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		
		request.setCharacterEncoding("utf-8");
		
		BulletinDao dao = new BulletinDao();
		String no= request.getParameter("no");
		
		BulletinBoard b = dao.searchBybNo(Integer.parseInt(no));
		request.setAttribute("bulletin", b);
		request.getRequestDispatcher("views/board/bulletinUpdateForm.jsp").forward(request, response);
	}

}
