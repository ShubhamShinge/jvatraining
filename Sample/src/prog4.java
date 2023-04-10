import java.util.*;
public class prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		int wholenum=(int)num;
		double frac=num-wholenum;
		System.out.println(num+"="+wholenum+"+"+frac);
	}
}
