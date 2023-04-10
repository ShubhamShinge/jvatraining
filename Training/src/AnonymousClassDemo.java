
interface RadioAnonymous {
	void scan();
}

abstract class AnimalAnonymous {
	public AnimalAnonymous() {
		System.out.println("Animal cons called");
	}

	public abstract void eat();

	public abstract void drink();

	public void sleep() {
		System.out.println("Animnal sleeps");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		//Using Anonymous class we can create object of any interface/abstract class without creating a child.
		AnimalAnonymous a = new AnimalAnonymous()
		{
			@Override
			public void eat() {
				System.out.println("MEN EATS");

			}

			@Override
			public void drink() {
				System.out.println("MEN DRINKS");
			}
		};

		a.eat();
		a.drink();

		RadioAnonymous r = new RadioAnonymous() {
			@Override
			public void scan() {
				System.out.println("Radio scanned");

			}
		};
		r.scan();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("RUN CALLED BY :" + Thread.currentThread().getName());

			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		System.out.println("MAIN CALLED BY :" + Thread.currentThread().getName());

	}
}
