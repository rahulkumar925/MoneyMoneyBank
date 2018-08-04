//Program for Payment Gateway.
public class PaymentGateway {

	// Method to check if transaction is possible.
	public static boolean transfer(SavingsAccount sender, SavingsAccount receiver, double amount) {

		if (sender.getBalance() >= amount) {
			return true;
		} else {
			return false;
		}
	}

}
