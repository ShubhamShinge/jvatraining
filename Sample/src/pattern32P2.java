/*
 *     1 
 	   22 
       333 
       4444 
       : 
       N rows 
 */
import java.util.*;
public class pattern32P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(i+"");
			}System.out.println();
		}
	}

}
