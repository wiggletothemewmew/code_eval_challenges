package easy_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy_main.PrimePalindrome;

public class PrimePalindromeTest {

	@Test(expected=RuntimeException.class)
	public void test_getLargestPrimePalindromeLessThanArg_throwException() {
		PrimePalindrome.getLargestPrimePalindromeLessThanArg(1);
	}

	@Test
	public void test_getLargestPrimePalindromeLessThanArg() {
		assertEquals(PrimePalindrome.getLargestPrimePalindromeLessThanArg(3), 2);
		assertEquals(PrimePalindrome.getLargestPrimePalindromeLessThanArg(1000), 929);
		assertEquals(PrimePalindrome.getLargestPrimePalindromeLessThanArg(15), 11);
		assertEquals(PrimePalindrome.getLargestPrimePalindromeLessThanArg(9), 7);
		assertEquals(PrimePalindrome.getLargestPrimePalindromeLessThanArg(10), 7);
	}
}
