package com.sds.icto.mysite.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.util.Action;

public class GetMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("들어옵니까");
		MemberDao dao = new MemberDao();

		JSONObject map = new JSONObject();
		String email = request.getParameter("userId");
		System.out.println("email =" + email);

	
			
			if (dao.getMember(email, null) != null) {
				System.out.println("있어?");
				map.put("success", true);
			} else {
				map.put("success", false);

			}
		response.setContentType("text/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(map);
		response.getWriter().flush();
	}

}
