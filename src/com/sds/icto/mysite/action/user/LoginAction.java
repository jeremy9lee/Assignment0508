package com.sds.icto.mysite.action.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.MemberVo;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");

		MemberDao dao = new MemberDao();

		String password = request.getParameter("password");
		String email = request.getParameter("email");

		MemberVo member = dao.getMember(email, password);

		System.out.println(member + " : ");
		if (member != null) {
		
			HttpSession session = request.getSession(true);
			session.setAttribute("session", member.getName());
			session.setAttribute("sessionNo", member.getNo());
			response.sendRedirect("");
		} else {
			response.sendRedirect("member?a=loginform&result=false");
		}

	}

}
