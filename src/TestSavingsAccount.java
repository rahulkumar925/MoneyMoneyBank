
//Program to Test Savings Account.
import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("Raju", 10000);

		account.setAccNumber();

		System.out.println("Name: " + account.getAccountHolder() + "\nAccount Number: " + account.getAccNumber()
				+ "\nAccount Balance: " + account.getBalance());

		SavingsAccount account2 = new SavingsAccount("Sham");
		account2.setAccNumber();
		System.out.println("Name: " + account2.getAccountHolder() + "\nAccount Number: " + account2.getAccNumber()
				+ "\nAccount Balance: " + account2.getBalance());

		System.out.println("Next Account Number: " + account2.getNextAccNumber());

		// Deposit And withdrawal.

		double withdrawal = account.withdraw(1000);
		System.out.println("Balance after withdrawal: " + withdrawal + " in Account Number: " + account.getAccNumber());

		double deposit = account.deposit(1300);
		System.out.println("Balance after deposit: " + deposit + " in Account Number: " + account.getAccNumber());

		// Payment Transfer.
		System.out.println("Enter 1 if transfer is to be from " + account.getAccountHolder() + " to "
				+ account2.getAccountHolder() + " or 2 for vice versa.");
		
		
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
		System.out.println("Enter amount to be transferred.");
		double amount = scanner.nextDouble();
        
		
		if (a == 1) {

			if (PaymentGateway.transfer(account, account2, amount) == true) {
				System.out.println("Transaction Successful");
				account.setBalance(account.getBalance() - amount);
				account2.setBalance(account2.getBalance() + amount);

				System.out.println("New Account Balance: " + account.getAccountHolder() + ": " + account.getBalance());
				System.out
						.println("New Account Balance: " + account2.getAccountHolder() + ": " + account2.getBalance());
			} else {
				System.out.println("Transaction Unsuccessful");
			}
		} else {
			if (PaymentGateway.transfer(account2, account, amount) == true) {
				System.out.println("Transaction Successful");
				account.setBalance(account.getBalance() + amount);
				account2.setBalance(account2.getBalance() - amount);

				System.out.println("New Account Balance: " + account.getAccountHolder() + ": " + account.getBalance());
				System.out
						.println("New Account Balance: " + account2.getAccountHolder() + ": " + account2.getBalance());
			} else {
				System.out.println("Transaction Unsuccessful");
			}
		}
	}

}
