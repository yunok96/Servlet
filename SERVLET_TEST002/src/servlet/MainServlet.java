package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cp = req.getContextPath();
		String fUrl = req.getRequestURI();
		
		int dots = fUrl.indexOf(".", -1);
		
		//String nurl = fUrl.substring(0, fUrl.indexOf("\\.",-1));
		//System.out.println(nurl);
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		String url = fUrl.substring(cp.length(),dots);
		System.out.println(url);
		
		if("/member/join".equals(url)) {
			System.out.println("회원가입 표시");
			pw.print("<DOCTYPE html>");
			pw.print("<head>");
			pw.print("</head>");
			pw.print("<body>");
			pw.print("<form action='"+cp+"/member/insert.samsung'>");
			pw.print("<input type='hidden' name='hi' value='insert'>");
			pw.print("<input type='text' name='user_id' placeholder='아이디'>");
			pw.print("<input type='submit' value='회원가입'>");
			pw.print("</form>");
			pw.print("</body>");
			pw.print("</html>");
		}
//		if("/member/insert".equals(url)) {
//			String rr = req.getParameter("user_id");
//			System.out.println(rr);
//			System.out.println("회원 등록");
//		}
		if(req.getParameter("hi").equals("insert")) {
			System.out.println("url방식");
		}
	}


}
