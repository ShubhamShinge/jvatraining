import java.util.*;
public class matrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of matrix:");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int t[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				t[i][j]=a[j][i];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(t[i][j]+" ");
			}System.out.println();
		}
	}

}
