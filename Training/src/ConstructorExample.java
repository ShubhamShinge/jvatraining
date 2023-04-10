class Employee{
	int employeeId;
	String employeeName;
	
	public Employee() {
		System.out.println("Default Constructor");
		employeeId=-1;
		employeeName="Not Available";
	}
	
	public Employee(int employeeId) {
		this();
		System.out.println("Employee 1 arg Constructor - int");
		this.employeeId=employeeId;
	}
	public Employee(String employeeName) {
		this();
		System.out.println("Employee 1 arg constructor - String");
		this.employeeName=employeeName;
	}
	public Employee(int employeeId, String employeeName) {
		System.out.println("Employee 2 arg constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void display() {
		System.out.println("Employee Id:"+this.employeeId);
		System.out.println("Employee Name:"+this.employeeName);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(101);
		Employee e3=new Employee("Mr. E3");
		Employee e4=new Employee(104,"Mr. E4");
				
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}

}
