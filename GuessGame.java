package AlgoPrograms_Day16_17;

import java.util.Scanner;

public class GuessGame {
	
	
	public static void binarySearch(int first, int last, int randomeNumber, int element) {
		Scanner sc = new Scanner(System.in);
		int mid = (first + last)/2;
		
		//recursion stops when number is guessed
		if(element==randomeNumber)
			System.out.println("Found: " +element);

		//calls the method again if guessed number is smaller and takes another guess
		else if(element>randomeNumber) {
			System.out.println("Guess a smaller number: ");
			element = sc.nextInt();
			binarySearch(first, mid-1, randomeNumber, element);
		}

		//calls the method again if guessed number is larger and takes another guess
		else if(element<randomeNumber) {
			System.out.println("Guess a larger number: ");
			element = sc.nextInt();
			binarySearch(mid+1, last, randomeNumber, element);	
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number till which the game is to be played");
		int N = sc.nextInt();
		
		int randomNumber = (int) Math.floor(Math.random()*10)%N;
		//System.out.println(randomNumber);
		
		System.out.println("Guess a number");
		int element = sc.nextInt();
		
		binarySearch(0, N, randomNumber, element);
	}
}
