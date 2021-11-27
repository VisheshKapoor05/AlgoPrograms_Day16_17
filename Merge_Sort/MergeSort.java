package AlgoPrograms_Day16_17.Merge_Sort;

import java.lang.reflect.Array;

public class MergeSort {

	int N;
	
	public String[] mergeSort(String[] array, int left, int right) {
		
		N = right+1; 
		if(left<right) {
			int mid = (left + right)/2;
			mergeSort(array, left, mid);		// first array is from left to mid
			mergeSort(array, mid+1, right);		// second array is from mid+1 to right
			mergeArray(array, left, mid, right);
		}
		
		return array;
	}
	
	
	
	String[] tempArray = new String[N];		// temporary array to store the sorted elements after merge
	
	//merging left array with right after sorting
	public void mergeArray(String[] array, int left, int mid, int right) {
		
		int i = left;		// first array is from left to mid
		int j = mid+1;		// second array is from mid+1 to right
		int k = left;		// starting index for tempArray 
		
		// comparing and sorting arrays till either first or second array exhausts
		while(i<=mid && j<=right) 
		{
			if(array[i].compareTo(array[j])<0)
			{
				tempArray[k] = array[i];
				i++;
			}
			else if(array[i].compareTo(array[j])>0)
			{
				tempArray[k] = array[j];
				j++;
			}
			k++;
		}
		
		
		// if first array is exhausted, store second array in tempArray as it is because it is already sorted
		if(i>mid)		 
		{
			while(j<=right) {
				tempArray[k] = array[j];
				j++;
				k++;
			}
		}
		// if second array is exhausted, store first array in tempArray as it is because it is already sorted
		else if(j>right) 
		{
			while(i<=mid) {
				tempArray[k] = array[i];
				i++;
				k++;
			}
		}
		
		//storing tempArray into the original array
		for(int l=left; l<right; l++) {
			array[l] = tempArray[l];
		}
	}
	
}
