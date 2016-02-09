package moderate_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import moderate_main.DetectingCycles;

public class DetectingCyclesTest {

	@Test
	public void test_getFirstCycle() {
		String[] array1 = {"2", "0", "6", "3", "1", "6", "3", "1", "6", "3", "1"};
		assertEquals(DetectingCycles.getFirstCycle(array1), "6 3 1");
		String[] array2 = {"3", "4", "5", "6", "3", "4", "5", "3", "4", "5"};
		assertEquals(DetectingCycles.getFirstCycle(array2), "3 4 6 5");
		String[] array3 = {"4", "3", "4", "5", "3", "4", "5", "3", "4", "5"};
		assertEquals(DetectingCycles.getFirstCycle(array3), "4 3");
	}

}
