package lab03_strategy;

public class SavingAccount extends Account {
	
	private IInterestStrategy strategy = new SavingInterestStrategy();
	
	public SavingAccount() {
		setAccInterestType(strategy);
	}
}
