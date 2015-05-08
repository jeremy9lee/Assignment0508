package com.sds.icto.mysite.action.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.MemberVo;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");

		MemberDao dao = new MemberDao();

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String agreeProv = request.getParameter("agreeProv");

		System.out.println(name + " : " + password + " : " + email + " : " + gender + ":" + agreeProv);
		if (agreeProv.equals("y")) {
			dao.insert(new MemberVo(null, name, email, password, gender));
			response.sendRedirect("views/user/joinsuccess.jsp");
		}
		
	}

}
