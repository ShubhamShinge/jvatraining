package singleTonDemo;

public class Payment {
	static Payment p1;
	private Payment() {
		System.out.println("Payment Object created");
	}
	public static Payment getPaymentInstance() {
		if(p1==null){
			p1=new Payment();
		}
			return p1;
	}
	public void depositeMoney(int amount,String name) {
		System.out.println(amount+"is deposited by"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
