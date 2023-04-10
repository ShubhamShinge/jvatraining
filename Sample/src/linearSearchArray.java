import java.util.*;
public class linearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("Enter element you want to search:");
		int search=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(search==arr[i]) {
				System.out.println(search+" is present at position "+i+" in array.");
				System.exit(0);
			}
		}
		System.out.println(search+" is not present in array.");
	}

}
