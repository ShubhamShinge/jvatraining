//a. 1, 2, 6, 15, 31, 56 … N
import java.util.*;
public class series22P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=1;
		double a=1;
		while(sum<=n) {
			System.out.print((int)sum+" ");
			sum=sum+Math.pow(a, 2.0);
			a++;
		}
	}

}
