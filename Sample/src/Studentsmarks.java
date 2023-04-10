import java.util.*;
public class Studentsmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Students Name:");
		String name=sc.next();
		System.out.println("Enter Marks for Maths,Science.English:");
		int math=sc.nextInt();
		int scince=sc.nextInt();
		int english=sc.nextInt();
		int total=math+scince+english;
		System.out.println("total marks:"+total);
		int avg=total/3;
		System.out.println("Avg Marks:"+avg);
		if(avg>=60) {System.out.println("1st Class");}
		else if(avg>=50) {System.out.println("2nd Class");}
		else if(avg>=35){System.out.println("Pass");}
		else {System.out.println("Pass");}
		}
	}


