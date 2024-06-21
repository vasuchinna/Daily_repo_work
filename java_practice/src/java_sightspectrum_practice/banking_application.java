package java_sightspectrum_practice;

public class banking_application {
	
	static int current_balance=1000;
	
	public static void greet_customer() {
		System.out.println("Hello welcome to the HDFC banking application");
	}

	public void deposit(int amount) {
		current_balance+=amount;
		System.out.println("["+amount+"]"+" Amount is deposited succesfully....:)");
	}
	
	public  void withdrawl(int amount) {
		current_balance-=amount;
		System.out.println("["+amount+"]"+" Amount withdrawl succesfully....:(");
	}
	public  int get_current_balance() {
		return current_balance;
	}
	
	public static void main(String[] args) {
		banking_application bank=new banking_application();
		greet_customer();
		System.out.println("current balance is :"+bank.get_current_balance());
		bank.deposit(500);
		System.out.println("current balance is : "+bank.get_current_balance());
		bank.withdrawl(350);
		System.out.println("current balance is : "+bank.get_current_balance());
		
	}

}
