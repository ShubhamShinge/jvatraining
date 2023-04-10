import java.util.*;
public class series12P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int n1=1;
		int n2=4;
		if(n>=n1) {System.out.print(n1+" ");}
		if(n>=n2) {System.out.print(n2+" ");}
		int sum=7;
		while(n>=sum) {
			System.out.println(sum+" ");
			n1=n2;
			n2=sum;
			sum=n1+n2;
			
		}
	}

}
