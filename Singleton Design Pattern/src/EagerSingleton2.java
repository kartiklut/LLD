
public class EagerSingleton2 {

	private static final EagerSingleton2 eagerSingleton2 = new EagerSingleton2();

	public static EagerSingleton2 getEagerSingletonInstance() {
		return eagerSingleton2;
	}
}

//class Main {
//
//	public static void main(String[] args) {
//		EagerSingleton2 eagerSingleton2Instance1=EagerSingleton2.getEagerSingletonInstance();
//		System.out.println(eagerSingleton2Instance1.hashCode());
//		EagerSingleton2 eagerSingleton2Instance2=EagerSingleton2.getEagerSingletonInstance();
//		System.out.println(eagerSingleton2Instance2.hashCode());
//		
//		//Here we have already created one Eager Instance of SingleTon class
//		//All objects will now have same object.
//		
//		
//		//DISADVANTAGE
//		//This will get initialized even if none of the resources want to access it.
//		//So, this will be waste of resources.
//		//So it is better to use LazyInitialization, but that will not work in thread same. Check next
//		
//
//	}
//}