package lab03_strategy;

import java.math.BigDecimal;

public class Account {

	private BigDecimal balance;

	private IInterestStrategy accInterestType;

	public void setAccInterestType(IInterestStrategy accInterestType) {
		this.accInterestType = accInterestType;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void addInterest(BigDecimal balance) {
		this.accInterestType.addInterest(balance);
	}
}
