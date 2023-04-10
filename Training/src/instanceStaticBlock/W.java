package instanceStaticBlock;

public class W {
	static{
		System.out.println("W Static block");
	}
	{
		System.out.println("W instance Block");
	}
	public W() {
		System.out.println("W Constructor");
	}
}
