package model;

import java.time.LocalDateTime;

public class Board {
	private int seq;
	private String title;
	private String content;
	private String create_date;
	
	public Board(int seq, String title, String content, String create_date) {
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.create_date = create_date;
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
	public String getCreate_date() {
		return create_date;
	}
	
	
}
