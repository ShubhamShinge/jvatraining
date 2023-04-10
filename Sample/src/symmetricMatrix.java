import java.util.*;
public class symmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of matrix:");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]!=a[j][i]) {
					System.out.println("No! This is not a symmetric matrix.");
					System.exit(0);
				}
			}
		}System.out.println("Yes! This is a symmetric matrix.");
		
	}

}
