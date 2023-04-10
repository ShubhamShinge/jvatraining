import java.util.*;
public class checkFibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fib1=0;
		int fib2=1;
		int fibsum=fib1+fib2;
		if(n==fib1) {
			System.out.println(n+" is a fibanacci no.");
		}
		else {
			while(n>=fibsum) {
				if(n==fibsum) {
					System.out.println("yes!"+n+" is a fianacci no.");
					System.exit(0);
				}
				int temp=fib2;
				fib2=fibsum;
				fibsum=temp+fib2;
			}
			System.out.println(n+" is not a fibanacci no.");
		}
		
	}

}
