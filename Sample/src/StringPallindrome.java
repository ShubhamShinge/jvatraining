import java.util.*;
public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		for(int i=0;i<=(l/2);i++) {
			if(s.charAt(i)!=s.charAt(l-1-i)) {
				System.out.println(s+" is not a palindrome");
				System.exit(0);
			}
		}System.out.println(s+" is a Palindrome.");
	}

}
