package easy_main;

/**
 * Write a program which determines the sum of the first 1000 prime numbers.
 *
 */
public class SumOfPrimes {

	public static boolean isOddNumberPrime(int number){
		for (int i=3; i*i <= number; i+=2){
			if (number%i==0) return false;
		}
		return true;
	}
	
	public static int getSumOfInputNumberOfPrimes(int number) {
		int sum = 2, primeCandidate = 3;
		while (number != 1) {
			if (isOddNumberPrime(primeCandidate)){
				sum += primeCandidate;
				number--;
			}
			primeCandidate += 2;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(getSumOfInputNumberOfPrimes(1000));

	}

}
