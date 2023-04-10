import java.util.*;
public class lcmOfNumbers {
	 static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		 if(a==b) {
			return a;
			}
		if(a>b) {
			return gcd(a-b,b);
			}
		else {
			return gcd(a,b-a);
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No.:");
		int n1=sc.nextInt();
		System.out.println("Enter a No.:");
		int n2=sc.nextInt();
		int lcm=(n1*n2)/gcd(n1,n2);
		System.out.println("LCM is:"+lcm);
		char c='y';
		while(c=='y') {
			System.out.println("Enter Do you want to add another no.(y/n):");
			c=sc.next().charAt(0);
			if(c=='y') {
				System.out.println("Enter a No.:");
				n1=sc.nextInt();
				n2=lcm;
				lcm=(n1*lcm)/gcd(n1,lcm);
				System.out.println("LCM is:"+lcm);
			}
		}System.out.println("Thank You");
	}

}
