//b. 1, 1, 2, 3, 5, 8, 13, … N

import java.util.*;
public class series22P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fib1=1;
		int fibsum=fib1;
		while(n>=fibsum) {
			if(fibsum==1) {
				System.out.print(fib1);
				
			}
			System.out.print(" "+fibsum);
			int temp=fib1;
			fib1=fibsum;
			fibsum=fibsum+temp;
			
		}
	}

}
