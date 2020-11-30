package models;

public class Board {
	private int seq;
	private String title;
	private String content;
	private String timestamp;
	public Board(int seq, String title, String content, String timestamp) {
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.timestamp = timestamp;
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
	public String getTimestamp() {
		return timestamp;
	}
}
