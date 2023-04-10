package instanceStaticBlock;

public class Z {
	public Z() {
		System.out.println("Z Constructor");
	}
	static {
		System.out.println("Z Static Block");
	}
	
	{
		System.out.println("Z instance block");
	}
	W w=new W();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Main");
		Z z1=new Z();
		System.out.println("Again");
		new Z();
		
	}

}
