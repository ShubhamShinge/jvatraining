//c. 1, 2, 4, 6, 7,10, 10,14… N 
import java.util.*;
public class series22P3 {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a=1;
		int b=2;
		while(a<=n|b<=n) {
			if(a<=n) {
				System.out.print(a+", ");
				a+=3;
			}
			if(b<=n) {
				System.out.print(b+", ");
				b+=4;
			}
		}
			
		
;	}
}
