/*
 *      1
		1 2 
		6 24 120 
		..
		n;
 */
import java.util.*;
public class pattern33P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		if(n>=1) {
			System.out.println(1);
		}
		int num=1;
		int ctr=2;
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num=num*ctr;
				ctr++;
			}
			System.out.println();
		}
	}

}
