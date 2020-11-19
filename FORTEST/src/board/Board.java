package board;

public class Board {
	int seq;
	String title;
	String comment;
	String writer;
	
	public Board(int a, String b, String c, String d) {
		this.seq=a;
		this.title=b;
		this.comment=c;
		this.writer=d;
	}
	
	public int getSeq() {
		return this.seq;
	}
	public String getTle() {
		return this.title;
	}
	public String getComm() {
		return this.comment;
	}
	public String getWrt() {
		return this.writer;
	}
}
