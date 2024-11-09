package sep19;

public class DepositThread extends Thread {
	BankAccount account;
	int amount;
	
	public DepositThread(BankAccount account,int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		account.deposit(amount);
	}
}
