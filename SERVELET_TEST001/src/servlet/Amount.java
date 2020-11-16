package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Amount extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		System.out.println("총합 요청받음");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html; charset=utf-8"); 
		
		String amtStr1 = req.getParameter("one");
		String amtStr2 = req.getParameter("two");
		System.out.println(Integer.parseInt(amtStr1)+Integer.parseInt(amtStr2));
		
		pw.print("<DOCTYPE html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<p>");
		pw.print(Integer.parseInt(amtStr1)+Integer.parseInt(amtStr2));
		pw.print("</p>");
		pw.print("</body>");
		pw.print("</html>");
	}
}
