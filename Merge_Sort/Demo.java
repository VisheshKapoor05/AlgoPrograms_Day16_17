package AlgoPrograms_Day16_17.Merge_Sort;

import java.util.Scanner;

public class Demo {

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
		
		MergeSort obj = new MergeSort();
		String[] sortedArray = obj.mergeSort(array, 0, N-1);
		System.out.println(sortedArray);

	}

}
