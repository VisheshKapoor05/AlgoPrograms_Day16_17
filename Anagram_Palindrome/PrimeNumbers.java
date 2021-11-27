package AlgoPrograms_Day16_17.Anagram_Palindrome;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit to print all the prime numbers before 1000");
		int N = sc.nextInt();
		primeNumbers(1000);
	}
	
	
	public static void primeNumbers(int n) {
		
		if(n%2==0)
			System.out.println(2);
		
		int a =0;
		for(int i = 3; i < n; i++) 
		{
			for(int j = 2; j <= i/2 ; j++) 
			{
				if (i % j == 0) {		
					a=1;
					break;
				}
			}
			if(a==0)
				System.out.println(i);
			a=0;
		}
	}
	
	
}
