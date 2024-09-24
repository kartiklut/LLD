
public  class LazySingleton1 {
	private static LazySingleton1 lazySingleton1;
	
	private LazySingleton1() {}
	
	public static LazySingleton1 getLazyInstance() {
		if(lazySingleton1==null) {
			lazySingleton1=new LazySingleton1();
		}
		return lazySingleton1;
	}
}

//class Main {
//
//	public static void main(String[] args) {
////		LazySingleton1 lazySingleton1=new LazySingleton1(); //Not Allowed since we made it private;
//		
//		//USE LAZY INITIALIZATION
//		LazySingleton1 lazySingleton1=LazySingleton1.getLazyInstance();
//		System.out.println("Object1 : " +lazySingleton1.hashCode());
//		
//		
//		LazySingleton1 lazySingleton2=LazySingleton1.getLazyInstance();
//		System.out.println("Objec2 : " +lazySingleton2.hashCode());
//		
//		//BOTH WILL PRINT SAME AS ONLY ONE OBJECT IS CREATED
//
//		/*
//		 *1. We are only creating singleton object when we need it.
//		 *So, to make it accessible we can do Earger Initialization
//		 **/
//		
//
//	}
//}