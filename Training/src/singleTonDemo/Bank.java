package singleTonDemo;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment Shubham=Payment.getPaymentInstance();
		Shubham.depositeMoney(1000,"Shubham");
		Payment Lokesh=Payment.getPaymentInstance();
		Lokesh.depositeMoney(2000,"Lokesh");
		Payment Pratham=Payment.getPaymentInstance();
		Pratham.depositeMoney(3000,"Pratham");
	}

}
