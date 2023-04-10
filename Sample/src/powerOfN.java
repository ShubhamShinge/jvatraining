import java.util.*;
public class powerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x:");
		int x=sc.nextInt();
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul*=x;
		}
		System.out.println(x+"^"+n+"="+mul);
	}

}
