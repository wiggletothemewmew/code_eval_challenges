package easy_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Given numbers x and n, where n is a power of 2, print out the smallest multiple of n which is greater than or equal to x. Do not use division or modulo operator.
 *
 */
public class MultiplesOfANumber {
	
	public static int getSmallestMultipleOfYGreaterThanX(int x, int y){
		int multiple = y;
		while (multiple < x)
			multiple += y;
		return multiple;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] arguments = line.trim().split(",");
            System.out.println(getSmallestMultipleOfYGreaterThanX(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
        }
        buffer.close();
	}

}
