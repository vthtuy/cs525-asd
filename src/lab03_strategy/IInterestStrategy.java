package lab03_strategy;

import java.math.BigDecimal;

public interface IInterestStrategy {

	void addInterest(BigDecimal balance);
}
