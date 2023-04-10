package Excercise;
import java.util.*;

class Eggs{
	int eggs=0;
	public Eggs(int eggs){
		//System.out.println("Constructor got called");
		this.eggs=eggs;
	}
	public void display() {
		int gross=(this.eggs)/144;
		int grossRemained=(this.eggs)%144;
		int dozen=grossRemained/12;
		int single=grossRemained%12;
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, and "+single+" eggs.");
	}
}
public class Ex1_NoOfeggs {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Eggs");
		int noOfEggs=sc.nextInt();
		Eggs e=new Eggs(noOfEggs);
		e.display();
	}
}
