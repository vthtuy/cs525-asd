package lab03_strategy;

public class Account {
	
	private InterestStrategy accInterestType;
	
	public void setAccInterestType(InterestStrategy accInterestType) {
		this.accInterestType = accInterestType;
	}
	
}
