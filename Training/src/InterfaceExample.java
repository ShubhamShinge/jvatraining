abstract class Vehicle11{
	int price=1000;
	public void start() {
		System.out.println("Vehicle started");
	}
	abstract public void stop();
}
interface MusicPlayer{
	void play();
	int noOfSongs=100;
}
interface Radio{
	void scan();
	int frequency=93;
	int a=0;
}
interface AdvancedMusicPlayer extends MusicPlayer{
	void shuffle();
}
class car1 extends Vehicle11 implements AdvancedMusicPlayer,Radio{
	int frequency=87;
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println(frequency);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		
	}
	
}
class bike1 extends Vehicle11 implements Radio{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Scan");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 c=new car1();
		c.start();
		
		//another way better one for garbage collector
		//this way we can only call methods which are defined in parent class as object is created of parent whether it is referrenced to child class.
		Vehicle11 v=new car1();
		v.start();
		
		v=new bike1();
		v.start();
	}

}
