import java.util.*;
public class customerTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c='y';
		int item_code;
		String item_name;
		int qty;
		double total=0;
		int price;
		while(c=='y') {
			System.out.println("Enter Item Code:");
			item_code=sc.nextInt();
			System.out.println("Enter Item Description:");
			item_name=sc.next();
			System.out.println("Enter Price:");
			price=sc.nextInt();
			System.out.println("Enter quantity:");
			qty=sc.nextInt();
			total=total+(qty*price);
			System.out.println("Do You Want To Continue (y/n):");
			c=sc.next().charAt(0);
		}
		if(total<=1000) {
			System.out.println("Do you want to use card payment(y/n:");
			c=sc.next().charAt(0);
			if(c=='y') {
				total=total*1.025;
			}
		}
		if(total>=10000) {
			total=total*0.9;
		}
		System.out.println("Your Total Amt. is"+total);
		
	}

}
