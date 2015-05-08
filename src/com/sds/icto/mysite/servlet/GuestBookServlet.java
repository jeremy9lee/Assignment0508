package com.sds.icto.mysite.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.action.guestbook.ActionFactory;
import com.sds.icto.mysite.util.Action;

@WebServlet("/guest")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GuestBookServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	protected void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {

			request.setCharacterEncoding("utf-8");
			String a = request.getParameter("a");
			ActionFactory af = ActionFactory.getInstance();
			Action action = af.getAction(a);
			
				action.execute(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		
		
	}

}
