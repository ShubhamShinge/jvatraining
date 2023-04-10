import java.util.*;
public class series22P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int n1=1;
		int n2=5;
		int n3=8;
		if(n>=1){
			System.out.print(1+" ");
			sum+=1;
		}
		if(n>=5){
			System.out.print(5+" ");
			sum+=5;
		}
		if(n>=8){
			System.out.print(8+" ");
			sum+=8;
		}
		while(n>=sum) {
			System.out.print(sum+" ");
			int temp=sum;
			sum=sum+temp-n1;
			n1=n2;
			n2=n3;
			n3=sum;
			
			
		}
	}
}
