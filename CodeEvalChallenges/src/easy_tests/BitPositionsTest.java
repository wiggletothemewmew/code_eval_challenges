package easy_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import easy_main.BitPositions;

public class BitPositionsTest {

	@Test
	public void test_isPos1SameAsPos2() {
		assertTrue(BitPositions.isPos1SameAsPos2(86, 2, 3));
		assertFalse(BitPositions.isPos1SameAsPos2(125, 1, 2));
	}

}
