package controller;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Constants;
import model.Memo;
import service.MemoService;

public class MainServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this);
		String uri = request.getRequestURI();
		
		if("/SESSION_TEST001/memo/input.samsung".equals(uri)) {
			request.getRequestDispatcher("/view/memo/input.jsp").forward(request, response);
		}
		if("/SESSION_TEST001/memo/save.samsung".equals(uri)) {
			Memo memo = new Memo(++Constants.MEMO_SEQ
					,request.getParameter("content")
					,LocalDateTime.now());
			MemoService.saveSession(request, memo);
		}
		if("/SESSION_TEST001/memo/list.samsung".equals(uri)) {
			request.getRequestDispatcher("/view/memo/list.jsp").forward(request, response);
		}
	}
}
