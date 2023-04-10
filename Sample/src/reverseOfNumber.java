import java.util.*;
public class reverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		
		int n=sc.nextInt();
		int temp=0;
		int newNum=0;
		while(n!=0) {
			temp=n%10;
			newNum=newNum*10+temp;
			n=n/10;
			
		}
		System.out.println(newNum);
	}

}
