package sep19;

public class WithdrawThread extends Thread {
	BankAccount account;
	int amount;
	
	public WithdrawThread (BankAccount account, int amount){
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		account.withdraw(amount);
	}
}
