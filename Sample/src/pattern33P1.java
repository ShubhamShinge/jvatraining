/*
 *     -1 
 	   -4-9 
       -16 25 -36 
        
       : 
       N rows 
 */
import java.util.*;
public class pattern33P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 | j==i) {System.out.print("-");}
			System.out.print((int)Math.pow(k, 2.0)+" ");
			k+=1;
			}System.out.println();
		}
	}

}
