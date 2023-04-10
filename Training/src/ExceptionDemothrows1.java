
public class ExceptionDemothrows1 {
	
	int num1;
	//throws keyword delegates/shift (checked)exception towards parent class where method is called. in this to main method.
	public void display1() throws InterruptedException {
		System.out.println("Hi");
		Thread.sleep(1000);
		System.out.println("Bye");
	}
	public void display2() throws InterruptedException {
		System.out.println("Hi");
		Thread.sleep(1000);
		System.out.println("Bye");
	}
	
	public static void main(String []args) {
		System.out.println("Welcome");
		ExceptionDemothrows1 e1=new ExceptionDemothrows1();
		try {
			e1.display1();
			e1.display2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Thanks");
	}

}
