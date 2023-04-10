import java.util.*;
public class pattern32P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int fib1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(fib1+" ");
			fib1=n1+n2;
			n1=n2;
			n2=fib1;
			//System.out.println(n1+","+fib1);
		}System.out.println();
		}
	}
}


