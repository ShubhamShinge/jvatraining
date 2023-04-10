import finance.Payment;
class Hello {
	int a;
	
	public void accept() {
		System.out.println("Accept called");
	}
	public void display() {
		accept();
		System.out.println("Display Called");
	}
	public static void main(String[] args) {
		//diff main in same file
		System.out.println("Hello");
		Hello h=new Hello();
		h.display();
		Bye b=new Bye();
		b.hello();
		
		//importing class from samr package.
		Customer c=new Customer();
		c.payBill();
		
		
		//importing class from diff package
		Payment p=new Payment();
		p.salary();
		
	}

}
class Bye{
	public static void main(String []args) {
		System.out.println("Bye Main Called");
		Hello H=new Hello();
		String names[]={"a","b"};
		H.accept();
	}
	public void hello() {
		System.out.println("Bye Hello Called");
		
	}
}
