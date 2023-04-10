import java.util.*;
public class identityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j & a[i][j]!=1) {
					System.out.println("No! This is not Identity Matrix.");
					System.exit(0);
				}
				else if(i!=j & a[i][j]!=0) {
					System.out.println("No! This is not Identity Matrix.");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes! This is a Identity Matrix.");
	}

}
