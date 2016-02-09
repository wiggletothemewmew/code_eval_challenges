package moderate_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Write a program which reads a file and prints to stdout the specified number of the longest lines that are sorted based on their length in descending order.
 *
 */
public class LongestLines {
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int counter = 0;
        int n = Integer.parseInt(buffer.readLine().trim());
        
        TreeMap<Integer, List<String>> lengthMap = new TreeMap<Integer, List<String>>();
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int lineLength = line.length();
            List<String> stringList = lengthMap.get(lineLength);
            if (stringList == null){
            	stringList = new ArrayList<String>();
            	lengthMap.put(lineLength, stringList);
            }
            stringList.add(line);
        }
        outerloop:
        for (Integer i: lengthMap.descendingKeySet()){
        	for (String string: lengthMap.get(i)){
        		System.out.println(string);
        		counter++;
        		if (counter == n) break outerloop;
        	}
        }
        buffer.close();
	}

}
