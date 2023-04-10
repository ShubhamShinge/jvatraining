/* 
		   * 
		  ** 
		 *** 
		****
		..
		N rows  
: 
*/

import java.util.*;

public class pattern33P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i-2;j++) {
				System.out.print(" ");
			}
			for(int j=n-i-1;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
