
//Program to check various transactions in a saving account.
public class SavingsAccount {

	private static int accountNumber = 100;
	private int accNumber;
	private String accountHolder;
	private double balance;

	public SavingsAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public SavingsAccount(String accountHolder) {
		this.accountHolder = accountHolder;
		balance = 0.0;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) {
		double amount1 = amount;
		balance = balance - amount;

		return balance;
	}

	public double deposit(double amount) {
		double amount1 = amount;
		balance += amount1;

		return balance;
	}

	public void setAccNumber() {
		this.accNumber = accountNumber++;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public int getNextAccNumber() {
		accNumber++;
		return accNumber;

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
