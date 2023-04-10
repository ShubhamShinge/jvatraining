import java.util.*;
public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		while(n!=0){
			s=n%2+s;
			n=n/2;
		}
		System.out.println(s);
		
	}

}
