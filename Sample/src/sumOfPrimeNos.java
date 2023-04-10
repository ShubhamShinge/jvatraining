import java.util.*;
public class sumOfPrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=2;i<=n;i++) {
			boolean flag1=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag1=false;
					break;
				}
				}
			if(flag1) {
				System.out.println(i);
				sum+=i;
			}
			}
		System.out.println("Sum is:"+sum);
		}
	
	}


