package a_examples;

public class Main {
	
	public static void main(String[] args) {
		/** 1. Create Account Object and Explain */
		Account account = new Account();
		
		/** 2. Access fields and explain. Showcase fields in Account class */
		account.name = "John Doe";
		account.id = 1001;
		account.balance = 3000.00;
		
		/** 3. Invoke methods and explain. Showcase methods in Account class */
		account.deposit(100.00);
		account.withdraw(500.00);
		account.printBalance();
	}
}
