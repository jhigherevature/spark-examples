package a_examples;

/** 1. Pre-prepare this class before lecture. Briefly discuss what it represents, but do not walk through all of the code. */
public class Account {
	String name;
	int id;
	double balance;
	
	public void deposit(double amt) {
		System.out.println("Depositing: " + amt);
		balance += amt;
	}
	public void withdraw(double amt) {
		System.out.println("Withdrawing: " + amt);
		balance -= amt;
	}
	public void printBalance() {
		System.out.println("Your balance is: " + balance);
	}
}
