package memb;

public class inMem {
	private int age;
	private String name;
	inMem(int a, String b){
		this.age=a;
		this.name=b;
	}
	public int getA() {
		return this.age;
	}
	public String getN() {
		return this.name;
	}
}