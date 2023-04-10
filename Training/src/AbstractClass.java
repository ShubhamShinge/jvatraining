abstract class Vehicle{
	//1.Abstarct methods can only be defined in abstract class only.
	//2.Use abstarct keyword.
	//3.There is no body for abstract class as it should define in child classess.
	//4. Use for methods to make them mandatory .
	public abstract void start();
	public void stop() {
		System.out.println("Stopped");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car has started");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.start();
		c.stop();
	}

}
