package moderate_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Given a sequence, write a program to detect cycles within it.
 * 
 */
public class DetectingCycles {
	static final int MAX = 99;
	
	public static String getFirstCycle(String[] sequence){
		StringBuilder cycle = new StringBuilder("");
		int[] seen = new int[MAX+1];
		for (String s: sequence){
			int i = Integer.parseInt(s);
			if (seen[i] != 0){
				if (seen[i] == 2) break;
				cycle.append(i + " ");
			}
			seen[i]++;
			
		}
		return cycle.toString().trim();
	}
	
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(getFirstCycle(line.split(" ")));
        }
        buffer.close();
    }
}

