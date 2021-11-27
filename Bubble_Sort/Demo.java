package AlgoPrograms_Day16_17.Bubble_Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of integers you want to sort");
		int N = sc.nextInt();
		
		int[] array = new int[N];
		System.out.println("Enter integers: ");
		for(int i=0; i<N; i++) {
			int element = sc.nextInt();
			array[i] = element;
		}
		
		BubbleSorting obj = new BubbleSorting();
		obj.bubbleSort(array);
	}

}
