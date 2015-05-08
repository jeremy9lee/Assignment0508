package com.sds.icto.mysite.action.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.MemberVo;

public class LoginFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		
		String result = request.getParameter("result");
		
		request.setAttribute("result", result);
		request.getRequestDispatcher("/views/user/loginform.jsp").forward(
				request, response);

	}

}
