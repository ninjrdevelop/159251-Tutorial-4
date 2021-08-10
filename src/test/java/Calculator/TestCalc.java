package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
	@Test
	void addTwoNumbersWorks() {
		Assertions.assertEquals(Calc.add(1, 2), 3);
	}
}
