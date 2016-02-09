package easy_main;

/**
 * Write a program which determines the largest prime palindrome less than 1000.
 *
 */
public class PrimePalindrome {

	public static boolean isPrime(int number){
		if (number%2==0) return false;
		for (int i=3; i*i <= number; i+=2){
			if (number%i==0) return false;
		}
		return true;
	}
	
	public static int getLargestPrimePalindromeLessThanArg(int input){
		if (input <= 2) throw new RuntimeException();
		for (int i=input-1; i > 2; i--){
			if (isPrime(i)){
				String i_string = String.valueOf(i);
				int i_length = i_string.length();
				if (i_length == 1) return i;
				int i_sublength1 = i_length/2;
				int i_sublength2 = (i_length%2==0) ? i_sublength1 : i_sublength1 + 1;
				String firstHalf = i_string.substring(0, i_sublength1);
				String lastHalfReversed = new StringBuilder(i_string.substring(i_sublength2)).reverse().toString();
				if (firstHalf.equals(lastHalfReversed)) return i;
			}
		}
		return 2;
	}
	
	public static void main(String[] args) {
		System.out.println(getLargestPrimePalindromeLessThanArg(1000));
	}

}

