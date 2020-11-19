package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	public Set<Integer> makeLotto() {
		Set<Integer> set = new HashSet<Integer>();
		Random rd = new Random();
		for (int i = 0; set.size()<6; i++) {
			set.add(rd.nextInt(45)+1);
		}
		return set;
	}
}
