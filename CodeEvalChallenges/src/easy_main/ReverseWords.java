package easy_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program which reverses the words in an input sentence.
 *
 */
public class ReverseWords {

	public static String reverseSentence(String sentence){
		String[] sentence_array = sentence.split(" ");
		StringBuilder builder = new StringBuilder("");
		for (int i=sentence_array.length-1; i >= 0; i--){
			builder.append(sentence_array[i] + " ");
		}
		return builder.toString().trim();
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	line = line.trim();
        	if (!line.equals(""))
        		System.out.println(reverseSentence(line));
        }
        buffer.close();
	}
}
