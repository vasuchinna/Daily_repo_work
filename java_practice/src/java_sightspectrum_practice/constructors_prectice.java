package java_sightspectrum_practice;

public class constructors_prectice {
	
	
// default constructor example
	
//public constructors_prectice() {
//		System.out.println("constructor is called");
//	}
//
//	public static void main(String[] args) {
//	
//		constructors_prectice s= new constructors_prectice();
//	}

	
	
// parametrized constructor example
	
//	int a=20;
//	
//	
//	public constructors_prectice(int a) {
//	super();
//	this.a = a;
//}
//
//
//	public static void main(String[] args) {
//		
//		
//		
//		
//	}
	
	// parametrized constructor example
	
//	int ninjaID;
//	String name;
//	constructors_prectice(int ID,String n){
//		ninjaID=ID;
//		name=n;	
//	}
//	void display() {
//		System.out.println(ninjaID+""+name);
//	}
//	public static void main(String[] args) {
//		constructors_prectice cons=new constructors_prectice(112," vasu");
//		cons.display();
//	}
	
	
	//parametrized constructors example
	
	
//	public int i;
//	public static void main(String[] args) {
//		constructors_prectice cp=new constructors_prectice();
//		System.out.println(cp.i);
//	}
//	public constructors_prectice() {
//		i=2023;
//		System.out.println("constructor is called");
//	}

		//constructor overloading example
	
	int id ;
	String name;
	constructors_prectice(){
		System.out.println("This is default constructor");
	}
	constructors_prectice(int i, String n){
		id=i;
		name=n;
		
	}
	public static void main(String[] args) {
		constructors_prectice cons=new constructors_prectice();
		System.out.println("\n Default constructor value : \n");
		System.out.println("student id : "+cons.id+" student name : "+cons.name);
		System.out.println("\n Parametrized constructors values : \n");
		constructors_prectice tata=new constructors_prectice(12,"vasu");
		System.out.println("student id :"+tata.id+"\n student name : "+tata.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
