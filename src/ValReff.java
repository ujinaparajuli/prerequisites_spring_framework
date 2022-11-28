//PASS BY VALUE 
public class ValReff {
	int n = 400;
	
	void  update(int n) {
		n+=50;  //CHANGE ONLY INSIDE THE LOCAL VARIABLE
		System.out.println("Inside function "+n);
	}
	
	public static void main(String[] args) {
		ValReff ob = new ValReff();
		System.out.println("Before calling function = "+ob.n);
		ob.update(ob.n);
		System.out.println("After calling function = "+ob.n);
	}

}
