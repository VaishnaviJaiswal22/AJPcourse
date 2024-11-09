package sep19;

public class MainA {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		DepositThread deposit = new DepositThread(account, 500);
        WithdrawThread withdraw = new WithdrawThread(account, 1100);
        
        deposit.start();
        withdraw.start();
        
        

	}

}
