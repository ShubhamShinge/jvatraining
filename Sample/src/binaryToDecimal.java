import java.util.*;
import java.lang.*;
public class binaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		double n=0;
		int l=s.length();
		
		for(int i=0;i<s.length();i++) {
			--l;
			if(s.charAt(i)=='1') {
			n=n+Math.pow(2.0,(double)l);
			}
		}
		System.out.println((int)n);
	}

}
