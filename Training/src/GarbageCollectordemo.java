class Orders{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Orders Class -Finalize called-Garbage Collected");
	}
}
public class GarbageCollectordemo {
	public static void main(String[] args) {
		System.out.println("Main Called");
		Orders o1=new Orders();
		Orders o2=new Orders();
		Orders o3=new Orders();
		Orders o4=o1;
		o2=null;
		o4=null;
		o3=null;
		System.gc();
		
	}
}
