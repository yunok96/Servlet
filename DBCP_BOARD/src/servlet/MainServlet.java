package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.equals("/DBCP_BOARD/insert.board")) {
			request.getRequestDispatcher("/insert.jsp").forward(request, response);
		}
		else if(uri.equals("/DBCP_BOARD/save.board")) {
			request.getRequestDispatcher("/save.jsp").forward(request, response);
		}		
		else if(uri.equals("/DBCP_BOARD/view.board")) {
			request.getRequestDispatcher("/view.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
