
public class StingExample {
	public static void main(String []args) {
		String s1="Shubham";
		String s2="Shubham";
		
		s1.concat(" Shinge"); //will concat and strore into another refference
		System.out.println(s1); //Shubham will print as it is referring to same refference
		
		System.out.println(s1==s2);//true  as it will compare refference (s1 and s2 both pointing same shubham)
		System.out.println(s1.equals(s2)); // true as it will compare value
		
		
		String s3=new String("Shubham");

		System.out.println(s1==s3);//false as new keyword will assign new referrence (s1 and s2 both pointing diff even having same value)
		System.out.println(s1.equals(s3));//true
		
		
		//SringBuffer  mutable and thread safe
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" galaxe");
		System.out.println(s1);
		
		//JDK1.5 - Not thread safe
		StringBuilder sb2=new StringBuilder("Bye");
		}
}
