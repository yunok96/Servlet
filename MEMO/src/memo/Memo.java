package memo;

import java.time.LocalDateTime;

public class Memo {
	private int seq;
	private String content;
	private LocalDateTime time;
	public Memo(int a, String b, LocalDateTime c) {
		this.seq=a;
		this.content=b;
		this.time=c;
	}
	public int getSeq() {
		return seq;
	}
	public String getContent() {
		return content;
	}
	public LocalDateTime getTime() {
		return time;
	}
}
