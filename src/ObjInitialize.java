class Rect{
	int l, b;
	
	void insert(int le, int br) {
		l = le;
		b = br;
		
	}
	
	void calculateA() {
		System.out.println(l*b);
	}
}

public class ObjInitialize {
	public static void main(String[] args) {
		Rect r1 = new Rect();
		r1.insert(10, 5);
		r1.calculateA();
	}
}
