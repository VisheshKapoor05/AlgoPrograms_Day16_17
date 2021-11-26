package AlgoPrograms_Day16_17.Insertion_Sort;

import java.util.Scanner;

public class InsertionDemo {

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
		
		InsertionSorting obj = new InsertionSorting();
		String[] sortedArray = obj.insertionSort(array);
		obj.displayArray(sortedArray);

	}

}
