/*
 *     * 
 	   ** 
       *** 
       **** 
       : 
       N rows 
 */
import java.util.*;
public class pattern31P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}System.out.println();
		}
	}

}
