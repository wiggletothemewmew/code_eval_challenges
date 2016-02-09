package easy_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy_main.ReverseWords;

public class ReverseWordsTest {

	@Test
	public void test_reverseSentence() {
		assertEquals(ReverseWords.reverseSentence("Hello World"), "World Hello");
		assertEquals(ReverseWords.reverseSentence("everything is awesome"), "awesome is everything");
	}

}
