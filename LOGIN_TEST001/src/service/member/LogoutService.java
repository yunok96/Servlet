package service.member;

import javax.servlet.http.HttpServletRequest;

public class LogoutService {
	public void logout(HttpServletRequest request) {
		request.getSession().invalidate();
	}
}
