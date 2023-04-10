import java.util.Scanner;

public class tryCatchDemo {
	int num1,num2,result;
	Scanner sc=new Scanner(System.in);
	public void display()
	{
	System.out.println("Enter first num:");
	num1=sc.nextInt();
	System.out.println("Enter second num:");
	num2=sc.nextInt();
	try {
		result=num1/num2;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		tryCatchDemo d1=new tryCatchDemo();
		d1.display();
		System.out.println("Thanks");
	}
}
