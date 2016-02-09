package easy_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy_main.SumOfPrimes;

public class SumOfPrimesTest {

	@Test
	public void test_getSumOfInputNumberOfPrimes() {
		assertEquals(SumOfPrimes.getSumOfInputNumberOfPrimes(6), 41);
		assertEquals(SumOfPrimes.getSumOfInputNumberOfPrimes(1000), 3682913);
	}

}
