package easy_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Players generally sit in a circle. The first player says the number “1”, and each player says next number in turn. However, any number divisible by X (for example, three) is replaced by the word fizz, and any divisible by Y (for example, five) by the word buzz. Numbers divisible by both become fizz buzz. A player who hesitates, or makes a mistake is eliminated from the game.

Write a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
 *
 */
public class FizzBuzz {

	public static String getFizzBuzzOutput(String line){
		String[] input = line.trim().split(" ");
		int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]), n = Integer.parseInt(input[2]);
		String output = "";
		for (int i = 1; i <= n; i++) {
			if (i%x != 0 && i%y != 0) output += i;
			else {
			   if (i % x == 0) output += "F";
			   if (i % y == 0) output += "B";
			}
			output += " ";
		}
		return output.trim();
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			System.out.println(getFizzBuzzOutput(line));
		}
       buffer.close();
	}

}
