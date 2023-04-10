import java.util.*;
public class multiplesOf7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		int j=0;
		while(true){
			if(i%2==1 &i%3==1&i%4==1&i%5==1&i%6==1) {
				j+=1;
				if(j!=3) {
				System.out.println(i);
				}
				if(j==4) {break;}
			}i+=7;
		}
	}

}
