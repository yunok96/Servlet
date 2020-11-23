package model;

import java.time.LocalDateTime;
import java.util.Date;

public class Memo {
	private int seq;
	private String content;
	private LocalDateTime create_date;
	
	public Memo(int seq, String content, LocalDateTime create_date) {
		super();
		this.seq = seq;
		this.content = content;
		this.create_date = create_date;
	}
	
	public int getSeq() {
		return seq;
	}
	public String getContent() {
		return content;
	}
	public LocalDateTime getCreate_date() {
		return create_date;
	}
}
