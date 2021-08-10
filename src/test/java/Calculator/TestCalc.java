package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
	@Test
	void addTwoNumbersWorks() {
		Assertions.assertEquals(3, Calc.add(1, 2));
	}

	@Test
	void subtractTwoNumbersWorks() {
		Assertions.assertEquals(1, Calc.subtract(2, 1));
	}
}
