package lab03_strategy;

import java.math.BigDecimal;

public class SavingInterestStrategy implements IInterestStrategy {

	@Override
	public void addInterest(BigDecimal balance) {
		System.out.println("Adding interest into Saving account");		
	}
}
