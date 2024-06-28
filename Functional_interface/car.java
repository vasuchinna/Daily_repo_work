package Functional_interface;

@FunctionalInterface
public interface car {

	void tata(String name);
	
	boolean equals(Object obj);
	
	default void fun1() {
		System.out.println("Inside the default method fun1 of car");
	}
	
	static void fun2() {
		System.out.println("inside the static method fun2 of car");
	}

}
