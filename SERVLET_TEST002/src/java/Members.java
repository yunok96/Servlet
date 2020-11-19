package java;

import java.util.ArrayList;
import java.util.List;

public class Members {
	public List<Member> selectMemberList(){
		List list = new ArrayList();
		list.add(new Member("steve", "1234", "james", 21));
		list.add(new Member("steve", "1234", "james", 21));
		list.add(new Member("steve", "1234", "james", 21));
		return list;
	}
}
