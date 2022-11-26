//PASS BY VALUE 
public class ValRef {
	int n = 400;
	
	void  update(int n) {
		n+=50;  //CHANGE ONLY INSIDE THE LOCAL VARIABLE
		System.out.println("Inside function "+n);
	}
	
	public static void main(String[] args) {
		ValRef ob = new ValRef();
		System.out.println("Before calling function = "+ob.n);
		ob.update(ob.n);
		System.out.println("After calling function = "+ob.n);
	}

}
