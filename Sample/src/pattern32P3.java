/*
 *     1 
 	   22 
       333 
       4444 
       : 
       N rows 
 */
import java.util.*;
public class pattern32P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(k+"");
			k+=1;
			}System.out.println();
		}
	}

}
