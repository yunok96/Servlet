package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cp = req.getContextPath();
		String fUrl = req.getRequestURI();
		
		int dots = fUrl.lastIndexOf(".");
		
		String url = fUrl.substring(cp.length(),dots);
		System.out.println(url);
		
		if("/member/join".equals(url)) {
			System.out.println("회원가입 표시");
			req.setAttribute("cp", cp);
			RequestDispatcher rd = req.getRequestDispatcher("/view/member/join.jsp");
			rd.forward(req, res);
			
		}
		if(req.getParameter("hi").equals("insert")) {
			System.out.println("url방식");
		}
		
		if(url.equals("a.samsung")) {
			RequestDispatcher rd = req.getRequestDispatcher("a.jsp");
		}
	}


}
