//EXAMPLE OF ENCAPSULATION WITH GETTERS AND SETTERS METHODS

class Account{
	//private data members
	private long acc_no;
	private String name, email;
	private float amount;
	
	 //public getter and setter methods..
	public long getAcc_no() {
		return acc_no;
	}
	
	public void setAcc_no(long acc) {
		acc_no = acc;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float a) {
		amount = a;
	}
	
}


public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.setAcc_no(3435);
		a1.setName("Ashish Poudel");
		a1.setAmount(50000);
		
		System.out.println(a1.getAcc_no() + " " + a1.getAmount()+ " " + a1.getName());

	}

}
