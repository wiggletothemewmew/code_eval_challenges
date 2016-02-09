package easy_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy_main.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test_getFizzBuzzOutput() {
		assertEquals(FizzBuzz.getFizzBuzzOutput("3 5 10"), "1 2 F 4 B F 7 8 F B");
		assertEquals(FizzBuzz.getFizzBuzzOutput("2 7 15"), "1 F 3 F 5 F B F 9 F 11 F 13 FB 15");
	}

}
