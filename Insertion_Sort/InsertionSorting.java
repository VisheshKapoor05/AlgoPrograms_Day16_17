package AlgoPrograms_Day16_17.Insertion_Sort;

public class InsertionSorting {
	
	public String[] insertionSort(String[] array) {
		
		for(int i=1; i<array.length; i++) {
		
			String temp = array[i];
			int j = i-1;
			
			while(j>=0 && array[j].compareTo(temp)>0) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = temp;
		
		}
		
		return array;
	}
	
	public void displayArray(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
