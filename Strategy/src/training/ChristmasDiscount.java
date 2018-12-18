package training;

import java.math.BigDecimal;

public class ChristmasDiscount implements Discount {

	@Override
	public BigDecimal apply(BigDecimal amount) {
		return amount.multiply(BigDecimal.valueOf(0.8));
	}
	
}
