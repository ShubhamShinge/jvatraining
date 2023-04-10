
public class OverloadingExample {
	public void add() {
		System.out.println("Please Enter Numbers");
	}
	public void add(int a,int b) {
		System.out.println("Addition is:"+(a+b));
	}
	public static void main(String[] args) {
		OverloadingExample e=new OverloadingExample();
		e.add();
		e.add(1,2);

	}

}
