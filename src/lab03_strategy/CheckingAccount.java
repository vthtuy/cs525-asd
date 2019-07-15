package lab03_strategy;


public class CheckingAccount extends Account {

	private IInterestStrategy strategy = new CheckingInterestStrategy();

	public CheckingAccount() {
		setAccInterestType(strategy);
	}
}
