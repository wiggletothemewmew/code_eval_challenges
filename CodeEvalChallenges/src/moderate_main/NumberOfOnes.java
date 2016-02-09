package moderate_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program which determines the number of 1 bits in the internal representation of a given integer.
 *
 */
public class NumberOfOnes {

	public static int getNumberOfOneBits(int input){
		int count = 0;
		char[] binaryString = Integer.toBinaryString(input).toCharArray();
		for (char bit: binaryString){
			if (bit=='1') count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(getNumberOfOneBits(Integer.parseInt(line)));
        }
        buffer.close();
	}

}
