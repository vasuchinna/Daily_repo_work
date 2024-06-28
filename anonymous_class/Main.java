package anonymous_class;

public class Main {

	public static void main(String[] args) {
		
		
		inter i=new inter() {

			
			@Override
			public void fun1(String name, int age) {
				System.out.println("welcome "+name);
				System.out.println("Your age is "+age);
			}
			
		};
		i.fun1("vasu",25);
	}

}
