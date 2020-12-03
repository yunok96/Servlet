package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;

public class MainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if("/BOARD_TEST002/menu.choi".equals(uri)) {
			request.getRequestDispatcher("/menu.jsp").forward(request, response);
		}
		else if("/BOARD_TEST002/input.choi".equals(uri)) {
			request.getRequestDispatcher("/input.jsp").forward(request, response);
		}
		else if("/BOARD_TEST002/insert.choi".equals(uri)) {			
			try {
				if(new BoardService().insertBoard(request)) {
					request.setAttribute("msg", "입력 성공");
				} else {
					request.setAttribute("msg", "입력 실패");
				}
				request.setAttribute("url", "/BOARD_TEST002/menu.choi");
				request.getRequestDispatcher("/alert.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
				request.setAttribute("msg", "오류 발생");
				request.setAttribute("url", "/BOARD_TEST002/menu.choi");
				request.getRequestDispatcher("/alert.jsp").forward(request, response);
			}
		}
		
	}
}
