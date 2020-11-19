package java;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member(String a, String b, String c, int d) {
		this.id=a;
		this.pw=b;
		this.name=c;
		this.age=d;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
