package util;

import javax.servlet.http.HttpServletRequest;

public class PageUtil {
	
	public static final int PER_PAGE_CNT = 3;
	
	public void setPage(HttpServletRequest request,Page page) {
		int pageCnt = page.getTotlaCnt() / PER_PAGE_CNT;
		if (0 < page.getTotlaCnt() % PER_PAGE_CNT) {
			pageCnt++;
		}
		page.setPageCnt(pageCnt);
		request.setAttribute("pageCnt", pageCnt);
	}

}
