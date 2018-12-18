package training;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Discount extends UnaryOperator<BigDecimal>{
	
	default Discount combine(Discount after) {
		return value -> after.apply(this.apply(value));
	}
	
	static Discount christmas() {
		return (amount) -> amount.multiply(BigDecimal.valueOf(0.8));
	}
	
	static Discount newyear() {
		return (amount) -> amount.multiply(BigDecimal.valueOf(0.7));
	}
		
	static Discount easter() {
		return (amount) -> amount.multiply(BigDecimal.valueOf(0.5)); 
	}
}
