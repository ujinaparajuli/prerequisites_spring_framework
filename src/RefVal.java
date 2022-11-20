//PASS BY VALUE 
public class RefVal {
	int n = 400;
	
	void  update(RefVal ob) {
		ob.n=ob.n+50;  
		System.out.println("Inside function "+ob.n);
	}
	
	public static void main(String[] args) {
		RefVal ob = new RefVal();
		System.out.println("Before calling function = "+ob.n);
		ob.update(ob);
		System.out.println("After calling function = "+ob.n);
	}

}
