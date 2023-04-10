package CollectionsDemo;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap will give result in order as it is.
		Map <String,Integer> employees=new LinkedHashMap<String,Integer>();
		employees.put("Shubham",100000);
		employees.put("Pratham",150000);
		employees.put("Lokesh",125000);
		System.out.println(employees);
		//this put will affect as Shubham key already exist so it will replace older ones.
		employees.put("Shubham",200000);
		employees.replace("Pratham",175000);
		System.out.println(employees);
		System.out.println(employees.get("Lokesh"));
		
		
	}

}
