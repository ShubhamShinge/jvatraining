package CollectionsDemo;
import java.util.*;
public class ArrayListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Used when we want fatser result and less addition/deletion.
		//It is Thread Unsafe
		List names=new ArrayList();
		names.add("Shubham");
		names.add("Pratham");
		names.add("Lokesh");
		names.add("Mohan");
		names.add("Lavin");
		
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		
		names.remove("Lavin");
		System.out.println(names);
		
		System.out.println(names.size());
		System.out.println(names.contains("Pratham"));
		System.out.println(names.get(2));
		System.out.println(names.isEmpty());
		names.clear();
		System.out.println(names.isEmpty());
		
		
	}

}
