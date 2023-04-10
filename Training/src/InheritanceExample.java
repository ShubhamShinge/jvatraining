class Vehicles{
	int price=1000;
	public void start() {
		System.out.println("Vehicle Started");
	}
	public void stop() {
		System.out.println("Vehicle stopped");
	}
}
class cars extends Vehicles{
	int price=2000;
	public void startAC() {
		System.out.println("AC Started");
	}
	public void printDetails() {
		int price=3000;
		System.out.println("Local price:"+price);//will print value from function
		System.out.println("Objct Price:"+this.price);//will print value from this class
		System.out.println("Parent price:"+super.price);//will print value from parent class.
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars c=new cars();
		c.start();
		c.stop();
		c.startAC();
		c.printDetails();
		
	}

}
