package keywordthis;

public class ThisSimulator {
	public static void main(String[] args) {
		Account acc_1 = new Account("Joseph", 1234, 100.0);
		System.out.println(acc_1.accountHolder);
		System.out.println(acc_1.accountValue);
		acc_1.deposit(50.0);
		System.out.println(acc_1.accountValue);
	}
}
