package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("servlet");
		String user_id;
		
		res.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = res.getWriter();
		pw.print("<DOCTYPE html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<input type='button' value='¾ß!'>");
		pw.print("</body>");
		pw.print("</html>");
	}
}
