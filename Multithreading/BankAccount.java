package sep19;

public class BankAccount {
	int balance = 10000;
	
	//method to deposit money
	public synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount + " Deposited now Current balance is : " + balance);
	}
	
	//method to withdraw money
	public synchronized void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount + " Withdraw now Current balance is : " + balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
