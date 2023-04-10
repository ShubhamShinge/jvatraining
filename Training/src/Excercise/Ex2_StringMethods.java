package Excercise;

class Mystring{
	String s;
	//constructor Method.
	public Mystring() {
		this.s="The quick brown fox jumps over the lazy dog";	
	}
	
	//1.Printing Char at 12th index
	public void printAt12() {
		//String s="asdfghjkjhgfdsasdfghj";
		System.out.println("The character at 12th index is:"+this.s.charAt(12));
	}
	
	//2.Check if String Contains word 'is'.
	public void checkIs() {
		if(this.s.contains("is")) {
			System.out.println("Yes! Your string contains 'is' word");
		}
		else {
			System.out.println("No! Your string does not contain 'is' word");
		}
	}
	
	//3.Add 'and killed it' to existing string.
	public void addString() {
		this.s=this.s.concat(" and killed it");
		System.out.println("Your String : "+this.s);
	}
	
	//4.Check whether string ends with word 'dogs'.
	public void endsWithdogs() {
		if(this.s.endsWith("dogs")) {
			System.out.println("Yes! Your string ends with 'dogs'.");
		}
		else {
			System.out.println("No! Your string doesn't ends with 'dogs'.");
		}
	}
	
	//5.Check if String Is equal to "“The quick brown Fox jumps over the lazy Dog".
	public void myStringCompare1() {
		if(this.s.equals("The quick brown Fox jumps over the lazy Dog")) {
			System.out.println("Yes! Your string is esqual to 'The quick brown Fox jumps over the lazy Dog'.");
		}
		else {
			System.out.println("No! Your string is not equal to 'The quick brown Fox jumps over the lazy Dog'.");
		}
	}

	//6.Check if String Is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".
		public void myStringCompare2() {
			if(this.s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")) {
				System.out.println("Yes! Your string is esqual to 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'.");
			}
			else {
				System.out.println("No! Your string is not equal to 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'.");
			}
		}
		
		//7.Find the length of string
		public int findLength() {
			return this.s.length();
		}

		//8.Check if string is equal to "The quick brown Fox jumps over the lazy Dog".
		public void myStringCompare3() {
			if(this.s.equals("The quick brown Fox jumps over the lazy Dog")) {
				System.out.println("Yes! Your String is equal to 'The quick brown Fox jumps over the lazy Dog'");
			}
			else {
				System.out.println("No! Your String is not equal to \"The quick brown Fox jumps over the lazy Dog\"");
			}
		}
		
		//9.Replace "The" with 'A'.
		public void replace() {
			this.s=this.s.replace("The","A");
			System.out.println("Your new string after replcement is :"+this.s);
		}
		
		//10. Split the string such that no two animals come in single string.
		public void splitString() {
			int secondAnimal=this.s.indexOf("dog");
			String String1=this.s.substring(0,secondAnimal);
			String String2=this.s.substring(secondAnimal,this.s.length());
			System.out.println("First String :"+String1);
			System.out.println("Second String :"+String2);
		}
		
		//11.Print Animals Name Separately.
		public void displayAnimals() {
			int first=this.s.indexOf("fox");
			int second=this.s.indexOf("dog");
			String animal1=this.s.substring(first, first+3);
			String animal2=this.s.substring(second,second+3);
			System.out.println("The Names of Animals Are : "+animal1+" and "+animal2);
		}
		
		//12.Print In Lower Case
		public void inLower() {
			System.out.println("Your String in lower case:"+this.s.toLowerCase());
		}
		
		//13.Print In Upper Case
		public void inUpper() {
			System.out.println("Your String in upper case:"+this.s.toUpperCase());
		}
		
		//14.Print index of a.
		public void indexOfa() {
			System.out.println("The a is located at :"+this.s.indexOf('a'));
		}
		
		//15.Last index of e.
		public void lastIndexOfe() {
			System.out.println("The last index of e in string is:"+this.s.lastIndexOf('e'));
		}
}
public class Ex2_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mystring mystring=new Mystring();
		
		mystring.printAt12();
		mystring.checkIs();
		mystring.addString();
		mystring.endsWithdogs();
		mystring.myStringCompare1();
		mystring.myStringCompare2();
		System.out.println("Length of String is:"+mystring.findLength());
		mystring.myStringCompare3();
		mystring.replace();
		mystring.splitString();
		mystring.displayAnimals();
		mystring.inLower();
		mystring.inUpper();
		mystring.indexOfa();
		mystring.lastIndexOfe();
	}

}
