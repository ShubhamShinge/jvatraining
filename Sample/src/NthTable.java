import java.util.*;

public class NthTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("What table you want to print :");
		int i= sc.nextInt();
		for(int a=1;a<=10;a++) {
			System.out.println(i+"x"+a+"="+(a*i));
		}

	}

}
