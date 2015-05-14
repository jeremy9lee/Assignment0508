package com.sds.icto.mysite.action.bulletin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sds.icto.mysite.util.Action;

public class BulletinWriteFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		
		request.setCharacterEncoding("utf-8");
		response.sendRedirect("views/board/bulletinWriteForm.jsp");
	}

}
