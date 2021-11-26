package AlgoPrograms_Day16_17.AnagramDetection;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.next();
		System.out.println("Enter String 2: ");
		String str2 = sc.next();
		
		StringToCharArray charArray1 = new StringToCharArray(str1);
		StringToCharArray charArray2 = new StringToCharArray(str2);
		
		AnagramCheck obj = new AnagramCheck();
		obj.anagramChecker(charArray1.array, charArray2.array);
	}

}
