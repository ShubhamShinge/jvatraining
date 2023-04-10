import java.util.*;
public class lcmOfArray {
	static int gcd(int a,int b) {
		if(a==0) {return b;}
		if(b==0) {return a;}
		if(a==b){return a;
		}
		if(a<b) {return gcd(a,b-a);}
		else {return gcd(a-b,b);}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int prev=arr[0];
		int lcm=0;
		for(int i=1;i<n;i++) {
			int next=arr[i];
			lcm=(prev*next)/gcd(prev,next);
			prev=lcm;
			
		}
		System.out.println("LCM is:"+lcm);
	}

}
