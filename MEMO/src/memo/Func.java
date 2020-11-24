package memo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Func {
	public void saveMemo(HttpServletRequest request, Memo memo) {
		HttpSession session = request.getSession();
		if(session.getAttribute("memoList")==null) {
			session.setAttribute("memoList", new ArrayList<Memo>());
		}
		List<Memo> memoList = (List)session.getAttribute("memoList");
		memoList.add(memo);
		session.setAttribute("memoList", memoList);
	}
}
