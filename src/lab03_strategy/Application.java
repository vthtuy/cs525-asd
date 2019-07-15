package lab03_strategy;

import java.math.BigDecimal;

public class Application {

	public static void main(String[] args) {
		System.out.println("....");
		AccountService service = new AccountService();
		
		CheckingAccount checkingAccount = new CheckingAccount();
		service.setAccount(checkingAccount);
		checkingAccount.setBalance(new BigDecimal(100));
		service.addInterest(checkingAccount.getBalance());
		
		SavingAccount savingAccount = new SavingAccount();
		service.setAccount(savingAccount);
		savingAccount.setBalance(new BigDecimal(100));
		service.addInterest(savingAccount.getBalance());
	}

}
