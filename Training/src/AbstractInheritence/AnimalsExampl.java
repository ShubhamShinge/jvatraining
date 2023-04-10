package AbstractInheritence;
//we cannot create objects of abstract class.
//all abstract methods should be overrided in all child classes
//if child class is also abstract u can have choice for overriding.
abstract class Animal{
	//abstract methoid can only be declared in abstract class only.
	public abstract void makenoise();
	public abstract void eat();
	public void sleep() {System.out.println("Animals are sleeping");};
	public abstract void roam();
	
}
//In abstarct class You have choice to override any method you want but remaining should overrided in child classes 
abstract class Feline extends Animal{
	public void roam() {
		System.out.println("Feline is roaming");
	}
}
//In normal class you have to override undefined abstract methods
class Lion extends Feline{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		System.out.println("Lion is making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lion is eating food");
	}
	
}

class Tiger extends Feline{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating food");
	}
	
}
class Cat extends Feline{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat is making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating food");
	}	
}

abstract class Hippo extends Animal{
	public void makenoise() {
		System.out.println("Hippo is making noise");
	}
	public void eat() {
		System.out.println("Hippo is eating");
	}
	
}
// In abstarct class You have choice to override any method you want but remaining should overrided in child classes 
abstract class Canine extends Animal{
	public void roam() {
		System.out.println("Canine is roaming");
	}
}
class Dog extends Canine{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		System.out.println("Dog is making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating food");
	}
	
}
// In normal class you have to override undefined abstract methods
class Wolf extends Canine{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		System.out.println("Wolf is making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Wolf is eating");
	}
	
}
public class AnimalsExampl {
	public static void main(String []args) {
		Wolf w=new Wolf();
		w.makenoise();
		w.roam();
		w.sleep();
	}
}
