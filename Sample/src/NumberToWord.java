import java.util.*;
public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		int range=sc.nextInt();
		for(int n=0;n<=range;n+=2){
			System.out.print(n*n+" ");
		}

	}

}
