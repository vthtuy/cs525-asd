package lab03_strategy;

import java.math.BigDecimal;

public class AccountService {
	
	private Account account;

	public void addInterest(BigDecimal balance) {
		account.addInterest(balance);
	}
	
	public void setAccount(Account acc) {
		this.account = acc;
	}
}
