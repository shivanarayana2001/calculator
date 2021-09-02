package prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.CAL;

class PrimeTest {
@Test
	void testAdd() {
		EXample ts = new EXample();
		int x=3;
		
		
		int actual =ts.Prime(x);
		int expected=1;
		assertEquals(expected, actual);
	}

}
