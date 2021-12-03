package keywordstatic;

public class StaticSimulator {
	public static void sayHello() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
//		Account.printAccountInfo();
		sayHello();
		Account.staticAccountMethod();
		
		Account acc_1 = new Account();
		acc_1.accountHolder = "Bob Smith";
		acc_1.accountId = 1001;
		acc_1.accountValue = 3.14;
		acc_1.count++; // increase count by 1
		acc_1.staticAccountMethod();
		
		Account acc_2 = new Account();
		acc_2.accountHolder = "Jane Doe";
		acc_2.accountId = 1002;
		acc_2.accountValue = 9999.99;
		acc_2.count++; // increase count by 1
		
		acc_1.printAccountInfo();
		acc_2.printAccountInfo();
		
		/*
		 * Access the static field directly from the class:
		 */
		System.out.println(Account.count);
		Account.count = 55;
		acc_1.printAccountInfo();
		acc_2.printAccountInfo();
	}
	
	
}
