import java.util.Scanner;

public class FinallyDemo {

	int num1,num2,result;
	Scanner sc=new Scanner(System.in);
	public int display(int i)
	{
	System.out.println("Enter first num:");
	num1=sc.nextInt();
	System.out.println("Enter second num:");
	num2=sc.nextInt();
	try {
		result=num1/num2;
		return i;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		return i+5;
	}
	finally{
//		result=num1/num2;
//		System.out.println("Finally Block");
		System.out.println(i);
		i+=20;
		System.out.println(i);
	}
	//System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		FinallyDemo d1=new FinallyDemo();
		System.out.println(d1.display(10));
		System.out.println("Thanks");
	}

}
