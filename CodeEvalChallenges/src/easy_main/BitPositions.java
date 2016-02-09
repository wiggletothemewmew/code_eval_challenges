package easy_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Given a number n and two integers p1,p2 determine if the bits in position p1
 * and p2 are the same or not. Positions p1 and p2 are 1 based.
 *
 */
public class BitPositions {

	public static boolean isPos1SameAsPos2(int n, int p1, int p2) {
		String binary = Integer.toBinaryString(n);
		int binaryLength = binary.length();
		return binary.charAt(binaryLength - p1) == binary.charAt(binaryLength - p2);
	}

	public static void main(String[] args) throws IOException {
		 File file = new File(args[0]);
	     BufferedReader buffer = new BufferedReader(new FileReader(file));
	     String line;
	     while ((line = buffer.readLine()) != null) {
	    	 String[] arguments = line.trim().split(",");
	    	 System.out.println(isPos1SameAsPos2(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2])));
	     }
	     buffer.close();
	}

}
