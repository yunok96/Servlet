package util;

public class PageUtil {
	
	public static final int PER_PAGE_CNT = 3;
	
	public int setPage(Page page) {
		int pageCnt = page.getTotlaCnt() / PER_PAGE_CNT;
		if (0 < page.getTotlaCnt() % PER_PAGE_CNT) {
			pageCnt++;
		}
		return pageCnt;
	}
	
}
