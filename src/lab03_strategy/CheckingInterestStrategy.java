package lab03_strategy;

import java.math.BigDecimal;

public class CheckingInterestStrategy implements IInterestStrategy {

	@Override
	public void addInterest(BigDecimal balance) {
		System.out.println("Adding interest into Checking account");
	}
}
