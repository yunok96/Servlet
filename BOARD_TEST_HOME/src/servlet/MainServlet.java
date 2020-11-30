package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;

public class MainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		if ("/BOARD_TEST_HOME/menu.home".equals(uri)) {
			request.getRequestDispatcher("/menu.jsp").forward(request, response);
		}
		else if ("/BOARD_TEST_HOME/input.home".equals(uri)) {
			request.getRequestDispatcher("/input.jsp").forward(request, response);
		}
		else if ("/BOARD_TEST_HOME/insert.home".equals(uri)) {
			try {
				if(new BoardService().insertBoard(request)) {
					request.setAttribute("msg", "입력 성공");
				} else {
					request.setAttribute("msg", "입력 실패");
				}
				request.setAttribute("url", "/BOARD_TEST_HOME/menu.home");
				request.getRequestDispatcher("/menu.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
				request.setAttribute("msg", "오류 발생");
				request.setAttribute("url", "/BOARD_TEST_HOME/");
			}	
		}
		else if ("/BOARD_TEST_HOME/list.home".equals(uri)) {
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		}
		else if ("/BOARD_TEST_HOME/detail.home".equals(uri)) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
