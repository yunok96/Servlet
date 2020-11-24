package servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memo.ConstNum;
import memo.Func;
import memo.Memo;

public class MainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.equals("/MEMO/input.memo")) {
			request.getRequestDispatcher("/input.jsp").forward(request, response);
		} else if(uri.equals("/MEMO/save.memo")) {
			Memo memo = new Memo(++ConstNum.seq, request.getParameter("cont"), LocalDateTime.now());
			new Func().saveMemo(request, memo);
		} else if(uri.equals("/MEMO/list.memo")) {
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		}
	}

}
