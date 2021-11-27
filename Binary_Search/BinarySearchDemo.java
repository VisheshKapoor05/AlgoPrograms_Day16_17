package AlgoPrograms_Day16_17.Binary_Search;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of strings you want to sort");
		int N = sc.nextInt();
		
		String[] array = new String[N];
		
		System.out.println("Enter strings: ");
		for(int i=0; i<N; i++) {
			String element = sc.next();
			array[i]= element;
		}
		BinarySearch obj = new BinarySearch();
		
		String[] sortedArray = obj.sort(array);
		System.out.println("Enter the string you want to search:");
		String element = sc.next();
		
		obj.binarySearch(sortedArray, 0, N-1, element);

	}

}
