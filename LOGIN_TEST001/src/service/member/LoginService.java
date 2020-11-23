package service.member;

import javax.servlet.http.HttpServletRequest;

public class LoginService {
	public boolean login(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		if ("steve".equals(userId)&&"1234".equals(userPw)) {
			request.getSession().setAttribute("userId", userId);
			return true;
		} else {
			return false;
		}
	}
}
