package service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Memo;

public class MemoService {
	public static void saveSession(HttpServletRequest request,Memo memo) {
		HttpSession session = request.getSession();
		if (null == session.getAttribute("memoList")) {
			session.setAttribute("memoList", new ArrayList<Memo>());
			
		}
		List<Memo> memoList = (List)session.getAttribute("memoList");
		memoList.add(memo);
		session.setAttribute("memoList", memoList);
	}
}
