package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.member.LoginService;
import service.member.LogoutService;


public class MainServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this);
		String uri = request.getRequestURI();
		
		if("/LOGIN_TEST001/member/loginPage.samsung".equals(uri)) {
			request.getRequestDispatcher("/view/member/login.jsp").forward(request, response);
		}
		if("/LOGIN_TEST001/member/login.samsung".equals(uri)) {
			if ( new LoginService().login(request) ) {
				response.sendRedirect("/LOGIN_TEST001/main/main.samsung");
			} else {
				request.setAttribute("message", "Login failed");
				request.setAttribute("url", "/LOGIN_TEST001/member/loginPage.samsung");
				request.getRequestDispatcher("/view/common/alert.jsp").forward(request, response);
			}
		}
		if("/LOGIN_TEST001/main/main.samsung".equals(uri)) {
			request.getRequestDispatcher("/view/main/main.jsp").forward(request, response);
		}
		if("/LOGIN_TEST001/member/logout.samsung".equals(uri)) {
			new LogoutService().logout(request);
			response.sendRedirect("/LOGIN_TEST001/member/loginPage.samsung");
		}
	}
}
