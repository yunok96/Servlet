package memb;

import java.util.List;
import java.util.ArrayList;

public class Member {
	public List<inMem> makelist(){
		List<inMem> li = new ArrayList<inMem>();
		li.add(new inMem(21,"Jack"));
		li.add(new inMem(23,"Black"));
		return li;
	}
}
