package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.equals("/FORTEST/sbak.sbak")) {
			request.getRequestDispatcher("/view/buy.jsp").forward(request, response);
		}
		else if(uri.equals("/FORTEST/view/calc.sbak")) {
			System.out.println(request.getParameter("where"));
			System.out.println(request.getParameter("temp"));
			System.out.println(request.getParameter("pay"));
			request.getRequestDispatcher("/view/calc.jsp").forward(request, response);
			Arrays.stream(request.getParameterValues("Coffee")).forEach(a->System.out.println(a+", "));
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
