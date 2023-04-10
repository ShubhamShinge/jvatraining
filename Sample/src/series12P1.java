import java.util.*;
public class series12P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		int i=2;
		int range=0;
		int n=sc.nextInt();
		while(range<=n) {
			range=(int)(Math.pow((double)i, 2.0));
			System.out.print(range+" ");
			i+=2;
		}
	}

}
