package model.ori;

public class Board {
	private int seq;
	private String title;
	private String content;
	private String time;
	
	public Board(int seq, String title, String content, String time) {
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.time = time;
	}
	public int getSeq() {
		return seq;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getTime() {
		return time;
	}
}
