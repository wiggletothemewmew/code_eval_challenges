package moderate_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import moderate_main.NumberOfOnes;

public class NumberOfOnesTest {

	@Test
	public void test_getNumberOfOneBits() {
		assertEquals(NumberOfOnes.getNumberOfOneBits(10), 2);
		assertEquals(NumberOfOnes.getNumberOfOneBits(22), 3);
		assertEquals(NumberOfOnes.getNumberOfOneBits(56), 3);
	}

}
