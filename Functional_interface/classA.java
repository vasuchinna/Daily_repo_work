package Functional_interface;

public class classA implements car{
	
	

	

	@Override
	public void tata(String name) {
		System.out.println("welcome"+name);
		
	}
	
public static void main(String[] args) {
		
	car vasu=new classA();
	vasu.tata(" vasu");
	vasu.fun1();
	car.fun2();
	System.out.println(vasu.equals(vasu));
		
	}

}
