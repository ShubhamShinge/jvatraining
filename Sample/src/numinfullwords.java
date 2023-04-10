import java.util.Scanner;
public class numinfullwords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int temp=0;
		int newNum=0;
		int i=0;
		while(n!=0) {
			temp=n%10;
			newNum=newNum*10+temp;
			n=n/10;
			
		}
		while(newNum!=0) {
			temp=newNum%10;
			newNum=newNum/10;
			switch(temp){
			case 1:System.out.print("One ");
			continue;
			case 2:System.out.print("Two ");
			continue;
			case 3:System.out.print("Three ");
			continue;
			case 4:System.out.print("Four ");
			continue;
			case 5:System.out.print("Five ");
			continue;
			case 6:System.out.print("Six ");
			continue;
			case 7:System.out.print("Seven ");
			continue;
			case 8:System.out.print("Eight ");
			continue;
			case 9:System.out.print("Nine ");
			continue;
			case 0:System.out.print("Zero ");
			continue;
			
			}
				
		}
	}
}
