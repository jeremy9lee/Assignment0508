package com.sds.icto.mysite.action.guestbook;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.GuestBookDao;
import com.sds.icto.mysite.util.Action;
import com.sds.icto.mysite.vo.GuestBook;

public class GuestBookDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {

		request.setCharacterEncoding("utf-8");
		GuestBookDao dao = new GuestBookDao();
		
		System.out.println("들어옴");
		
		String no = request.getParameter("no");
		String password = request.getParameter("password");
		String realPwd = dao.search(Integer.parseInt(no)).getPassword();

		request.setAttribute("no", no);
		if(realPwd.equals(password)){
			dao.delete(Integer.parseInt(no));
			response.sendRedirect("guest?a=guestbookform");
		}else{
			String msg = "비밀번호가 맞지 않습니다.";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/views/guestbook/deleteform.jsp").forward(request, response);
		}
			
	}

	
	
}
