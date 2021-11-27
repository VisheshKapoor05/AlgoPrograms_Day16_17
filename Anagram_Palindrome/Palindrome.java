package AlgoPrograms_Day16_17.Anagram_Palindrome;

public class Palindrome {
	
	public static void palindrome(int N) {
		
		int lastDigit = N%10;
		int firstDigit = 0;
		
		if(N/100 != 0) {
			firstDigit = N/100;	
		}
		else if(N/10 != 0 && N/100 == 0){
			firstDigit = N/10;
		}
		else {
			firstDigit = N;
		}

		if(lastDigit==firstDigit) {
			System.out.println(N);
		}
		
	}
	
	
	public static void primeNumbers(int N) {
		
		if(N%2==0)
			System.out.println(2);
		
		int a =0;
		for(int i = 3; i < N; i++) 
		{
			for(int j = 2; j <= i/2 ; j++) 
			{
				if (i % j == 0) {		
					a=1;
					break;
				}
			}
			if(a==0) {
				palindrome(i);
			}	
			a=0;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("All the palindrome prime numbers between 0 and 1000 are: ");
		primeNumbers(1000);
		
	}

}
