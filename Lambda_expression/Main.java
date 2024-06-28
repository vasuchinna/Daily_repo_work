package Lambda_expression;

public class Main {

	public static void main(String[] args) {
//		classA h=name->{
//				System.out.println("welcome "+name);
//				
//			};
//			
//		
//		h.hey("vasu");
		
		classA h1=(n1,n2)->{
			return n1+n2;
		};
		
//		classA h2=(n1,n2)->{
//			
//		};
//		
		System.out.println(h1.add(12, 34));
		System.out.println(h1.add(182, 34));
		
	}

}
