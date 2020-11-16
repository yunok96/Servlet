package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);//Get에 넘김
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String fUri = req.getRequestURI();
		String cp = req.getContextPath();
		int last = fUri.lastIndexOf(".");
		String url = fUri.substring(cp.length(), last);
		System.out.println(url);
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		if(url.equals("/member/join")) {
			pw.print("<DOCTYPE html>");
			pw.print("<header>");
			pw.print("</header>");
			pw.print("<body>");
			pw.print("<p>회원가입 메뉴</p>");
			pw.print("<form action='"+cp+"/member/id.home' method='post'>");//상관없나?
			pw.print("<input type='hidden' name='hide' value='insert'>");
			pw.print("<input type='text' name='id' placeholder='아이디'>");
			pw.print("<input type='submit' value='제출'>");
			pw.print("</form>");
			pw.print("</body>");
			pw.print("</html>");			
		}
		
		if(req.getParameter("hide").equals("insert")) {
			pw.print("<DOCTYPE html>");
			pw.print("<header>");
			pw.print("</header>");
			pw.print("<body>");
			pw.print("<p>"+req.getParameter("id")+"</p>");
			pw.print("</form>");
			pw.print("</body>");
			pw.print("</html>");
		}
	}
}
