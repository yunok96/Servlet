package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.BoardService;

public class MainServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this);
		String uri = request.getRequestURI();

		if ("/BOARD_TEST001/main/menu.samsung".equals(uri)) {
			request.getRequestDispatcher("/view/main/menu.jsp").forward(request, response);
		}
		if ("/BOARD_TEST001/board/boardList.samsung".equals(uri)) {
			try {
				new BoardService().selectBoard(request);
				request.getRequestDispatcher("/view/board/boardList.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("message", "게시글 조회 실패ㅠ");
				request.setAttribute("url", "/BOARD_TEST001/view/main/menu.jsp");
				request.getRequestDispatcher("/view/common/alert.jsp").forward(request, response);
			}
		}
		if ("/BOARD_TEST001/board/boardDetail.samsung".equals(uri)) {
			try {
				new BoardService().selectBoard(request);
				request.getRequestDispatcher("/view/board/boardDetail.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("message", "게시글 상세 조회 실패ㅠ");
				request.setAttribute("url", "/BOARD_TEST001/view/main/menu.jsp");
				request.getRequestDispatcher("/view/common/alert.jsp").forward(request, response);
			}
		}
		if ("/BOARD_TEST001/board/boardInsertForm.samsung".equals(uri)) {
			request.getRequestDispatcher("/view/board/boardInsertForm.jsp").forward(request, response);
		}
		if ("/BOARD_TEST001/board/insertBoard.samsung".equals(uri)) {
			try {
				if (new BoardService().insertBoard(request)) {
					request.setAttribute("message", "게시글 작성 성공!");
				} else {
					request.setAttribute("message", "게시글 작성 실패ㅠ");
				}
				request.setAttribute("url", "/BOARD_TEST001/view/main/menu.jsp");
				request.getRequestDispatcher("/view/common/alert.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("message", "게시글 작성 실패ㅠ");
				request.setAttribute("url", "/BOARD_TEST001/view/main/menu.jsp");
				request.getRequestDispatcher("/view/common/alert.jsp").forward(request, response);
			}
		}
	}
}
