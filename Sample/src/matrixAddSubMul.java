import java.util.*;
public class matrixAddSubMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m:");
		int m=sc.nextInt();
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int arr1[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		System.out.println("Enter 1st matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Choice:\n1.Sum\n2.Subtract\n3.Multiply");
		int c=sc.nextInt();
		switch(c) {
		case 1:
		{
			int sum[][]=new int[m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					sum[i][j]=arr1[i][j]+arr2[i][j];
					System.out.print(sum[i][j]+" ");
				}System.out.println();
			}
		}
		case 2:
		{
			int sub[][]=new int[m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					sub[i][j]=arr1[i][j]-arr2[i][j];
					System.out.print(sub[i][j]+" ");
				}System.out.println();
			}
		}
		case 3:{
			if(m==n) {
			int mul[][]=new int[m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					mul[i][j]=0;
					for(int k=0;k<n;k++) {
						mul[i][j]+=arr1[i][k]*arr2[k][j];
					}
					System.out.print(mul[i][j]+" ");
				}System.out.println();
			}
			
		}
		}
		}
	}
}


