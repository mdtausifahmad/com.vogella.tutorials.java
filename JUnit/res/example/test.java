import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTests {

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		MyClass tester = new MyClass(); // MyClass is tested

		// assert statements
		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
	}
}