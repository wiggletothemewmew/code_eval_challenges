package easy_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy_main.MultiplesOfANumber;

public class MultiplesOfANumberTest {

	@Test
	public void test_getSmallestMultipleOfYGreaterThanX() {
		assertEquals(MultiplesOfANumber.getSmallestMultipleOfYGreaterThanX(13, 8), 16);
		assertEquals(MultiplesOfANumber.getSmallestMultipleOfYGreaterThanX(17, 16), 32);
		assertEquals(MultiplesOfANumber.getSmallestMultipleOfYGreaterThanX(15, 15), 15);
	}

}
