package cen4802;

import java.util.Scanner;

/**
 * This class tests performance of the fibonacci sequence implemented
 * in a recursive way.
 * @author Chris Hall
 * 
 *
 */

public class Assign2 {
	
	/**
	 * This is the main method.
	 * @param args
	 */

	public static void main(String[] args) {

		long number;
		long answer;
		long time;
		long speed;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a number: ");
		number = scnr.nextLong();

		time = System.nanoTime();
		answer = RecFibonacci(number);
		speed = System.nanoTime() - time;

		answer = RecFibonacci(number);

		System.out.println("Recursion fibonacci found the answer " + answer + " in: " + speed + "ns");

	}
	
	/**
	 * Returns recursive fibonacci calculation.
	 * @param n Number passed in by the user
	 * @return Long number
	 */

	public static long RecFibonacci(long n) {

		if (n <= 1)
			return n;
		return RecFibonacci(n - 1) + RecFibonacci(n - 2);

	}

}
