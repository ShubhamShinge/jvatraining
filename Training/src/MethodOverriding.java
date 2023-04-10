class Animal{
	public void eat() {
		System.out.println("Animals eat food");
	}
}
class Dog extends Animal{
	
}
class Men extends Animal{
	
	@Override //Method override of eat method from parent class.
	public void eat() {
		System.out.println("Animals eat veg and non veg");
	}     
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		//Here parent class method will get called.
		d.eat();
		Men m=new Men();
		//Here overrided method will get called from child class
		m.eat();
	}

}
