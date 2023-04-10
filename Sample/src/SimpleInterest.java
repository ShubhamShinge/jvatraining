import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("enter Principle:");
		Scanner shubham=new Scanner(System.in);
		double n = shubham.nextDouble();
		System.out.println("Enter Rate:");
		double r=shubham.nextDouble();
		System.out.println("Enter Time:");
		double t=shubham.nextDouble();
		double s=(n*r*t*0.01);
		System.out.println("S.I. is "+s);
		
	}

}
