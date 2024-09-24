
public class LazySingletonMultithreading3 {

	private static LazySingletonMultithreading3 lazySingletonMultithreading3;

	private LazySingletonMultithreading3() {
	}

	//This is called Synchronized block.
//	public synchronized static LazySingletonMultithreading3 getInstance() {
	public static LazySingletonMultithreading3 getInstance() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (lazySingletonMultithreading3 == null) {
			//Here we can either do synchronized method but that will create race condition.
			//so to avoid that we implemented synchronized block which will have Double check locking mechanism
			//DCL = When t1 comes it will check that instance is null and go inside the synchronized block and create the instance.
			//After that when t2 comes it will check that t1 is already in synchronized block and when t1 is done it will go inside and check that the object is already created.
			//when t3 comes it will check the first check and this time it is not null so it will directly run the already created one.
			synchronized(LazySingletonMultithreading3.class){
				if(lazySingletonMultithreading3==null) {
					lazySingletonMultithreading3 = new LazySingletonMultithreading3();
				}
			}
			
		}
		return lazySingletonMultithreading3;
	}

}

class MultithreadingLazySingleton1 extends Thread{
	
	@Override
	public void run() {
		LazySingletonMultithreading3 lazySingletonMultithreading1 = LazySingletonMultithreading3.getInstance();
		System.out.println("lazySingletonMultithreading1 : "+ lazySingletonMultithreading1.hashCode());
	}
}

class MultithreadingLazySingleton2 extends Thread{
	
	@Override
	public void run() {
		LazySingletonMultithreading3 lazySingletonMultithreading2 = LazySingletonMultithreading3.getInstance();
		System.out.println("lazySingletonMultithreading2 : "+ lazySingletonMultithreading2.hashCode());
	}
}


//class Main {
//	public static void main(String[] args) {
//		MultithreadingLazySingleton2 lazySingleton2=new MultithreadingLazySingleton2();
//		lazySingleton2.start();
//		MultithreadingLazySingleton1 lazySingleton1=new MultithreadingLazySingleton1();
//		lazySingleton1.start();
//
//	}
//
//}
