package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletChoi extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String fUrl = req.getRequestURI();
		String cp = req.getContextPath();
		int last = fUrl.indexOf(".",-1);
		String url = fUrl.substring(cp.length(), last);
		System.out.println(url);
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		if(url.equals("/member/signup")) {
			pw.print("<DOCTYPE html>");
			pw.print("<header>");
			pw.print("</header>");
			pw.print("<body>");
			pw.print("<form action='"+cp+"/member/insert.CHOI' method='post'>");
			pw.print("<input type='hidden' name='hi' value='insert'>");
			pw.print("<input type='text' name='user_id' placeholder='아이디 입력'>");
			pw.print("<input type='submit' value='완료'>");
			pw.print("</form>");
			pw.print("</body>");
			pw.print("</html>");
		}
		
		
		
		if(req.getParameter("hi").equals("insert")) {
			pw.print("<DOCTYPE html>");
			pw.print("<header>");
			pw.print("</header>");
			pw.print("<body>");
			pw.print("<p>");
			//pw.print(req.getParameter("user_id"));
			pw.print("로 회원가입 되셨습니다.<br>비밀번호는 ");
			//String pass = req.getParameter("user_pw");
			//String a = "";
			//for(int i = 0; i<pass.length(); i++) {
				//a+="*";
			//}
			//pw.print(a);
			pw.print("</p>");
			pw.print("</body>");
			pw.print("</html>");
		}
	}


}
