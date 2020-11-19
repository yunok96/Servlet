package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LottoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		System.out.println("연결됨");
		
		String uri = request.getRequestURI();
		String cp = request.getContextPath();
		int last = uri.lastIndexOf(".");
		String url = uri.substring(cp.length(), last);
		
		if(url.equals("/input")) {
			request.getRequestDispatcher("/view/lottoInput.jsp").forward(request, response);
		}
		else if(url.equals("/lotto")) {
			request.getRequestDispatcher("/view/lotto.jsp").forward(request, response);
		}
		
	}

}
