package AlgoPrograms_Day16_17.Binary_Search;

import AlgoPrograms_Day16_17.Insertion_Sort.InsertionSorting;

public class BinarySearch {
	
	public void binarySearch(String arr[], int first, int last, String element) {
		
		int mid = (first + last)/2;
		
		if (first > last)
	        System.out.println("Not found");
		
		if(arr[mid].compareTo(element)==0)
			System.out.println("Found: " +arr[mid]);

		else if(arr[mid].compareTo(element)>0)
			binarySearch(arr, first, mid-1, element);
		
		else if(arr[mid].compareTo(element)<0)
			binarySearch(arr, mid+1, last, element);
		
	}
	
	public String[] sort(String[] arr) {
		InsertionSorting obj = new InsertionSorting();
		String[] sortedArray = obj.insertionSort(arr);
		return sortedArray;
	}
	
	
}
