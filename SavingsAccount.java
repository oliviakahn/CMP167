// Inherit from BankAccount
// create a double variable named interest in Child class
// Test out all methods from parent class
public class SavingsAccount extends BankAccount{
	private double interest = 0.075;

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount();
	// Testing out deposit, withdraw, and toString methods from parent class
		account.deposit(5000);
		account.withdraw(1000);
		System.out.println(account.toString());
	}
	
	
	// I tested out the interest value using the deposit method
	@Override
	public void deposit(double amount) {
		System.out.println("Amount to deposit: $" + amount);
		double amtInterest = amount * interest;
		System.out.println("Adding interest... $" + amtInterest);
		amount = amount + amtInterest;
		super.deposit(amount);
	}
	
	
}
