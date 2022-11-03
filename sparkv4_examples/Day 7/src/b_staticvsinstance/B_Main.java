package b_staticvsinstance;

public class B_Main {
	public static void main(String[] args) {

		A_Account.staticAccountMethod();
		System.out.println(A_Account.count);
//		System.out.println( A_Account.accountHolder); // error = instance variables require objects
//		A_Account.printAccountInfo(); // error - instance methods require objects
//
//		A_Account acc_1 = new A_Account();
//		acc_1.accountHolder = "Bob Smith";
//		acc_1.accountId = 1001;
//		acc_1.accountValue = 3.14;
//
//		A_Account acc_2 = new A_Account();
//		acc_2.accountHolder = "Jane Doe";
//		acc_2.accountId = 1002;
//		acc_2.accountValue = 9999.99;
//
//		acc_2.count = 99;
//		
//		// notice that the instance fields are different, but the static count is the same
//		acc_1.printAccountInfo(); 
//		acc_2.printAccountInfo();

		/*
		 * Although you can access static fields and methods using object references, you should avoid doing so.
		 */
//		acc_1.staticAccountMethod();
//		acc_2.staticAccountMethod();
//		System.out.println(acc_1.count);
//		System.out.println(acc_2.count);
		
	}
}
