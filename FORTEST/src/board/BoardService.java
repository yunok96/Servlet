package board;

import java.util.ArrayList;
import java.util.List;

public class BoardService {
	public List<Board> makeBoard() {
		List<Board> li = new ArrayList<Board>();
		li.add(new Board(1,"Funny","Black Jack","BLACK JACK PLAYS BLACKJACK"));
		li.add(new Board(2,"Fun","Jack","BLACK JACK BLACKJACK"));
		li.add(new Board(3,"nn","Black Jack","nNnnNNNA"));
		return li;
	}
}
