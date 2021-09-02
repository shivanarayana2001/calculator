package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalTest {

	@Test
	void testAdd() {
		CAL c=new CAL();
		int x=20;
		int y=10;
		
		int actual =c.add(x, y);
		int expected=30;
		assertEquals(expected, actual);
	}

	@Test
	void testSub() {
		CAL c=new CAL();
		int x=20;
		int y=10;
		
		int actual =c.sub(x, y);
		int expected=10;
		assertEquals(expected, actual);
	}

	@Test
	void testMul() {
		CAL c=new CAL();
		int x=20;
		int y=10;
		
		int actual =c.mul(x, y);
		int expected=200;
		assertEquals(expected, actual);
	}

	@Test
	void testDiv() {
		CAL c=new CAL();
		int x=20;
		int y=10;
		
		int actual =c.div(x, y);
		int expected=2;
		assertEquals(expected, actual);
	}

}
