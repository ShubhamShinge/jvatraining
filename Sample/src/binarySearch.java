import java.util.*;
public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter no. you want to search:");
		int a=sc.nextInt();
		int iL=0;
		int iR=n-1;
		int index=0;
		while(iL<=iR){
			//System.out.println("i="+index);
			index=(iL+iR)/2;
			if(a==arr[index]) {
				System.out.println("Yes! The element is at "+index+" position.");
				System.exit(0);
			}
			else if(a<arr[index]) {
				iR=index-1;
						
			}
			else if(a>arr[index]) {
				
				iL=index+1;
			}
		}System.out.println("No! The element is not there.");
	}

}
