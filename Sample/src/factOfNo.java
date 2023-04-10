import java.util.*;
public class factOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1) {System.out.println("Factorial of "+n+" is 1");}
		else {
			int fact=1;
			for(int i=2;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is:"+fact);
		}
	}

}
