package sortings;


/**
 * Problem Statement:  Given an array of n integers, sort the array using the Quicksort method.
 * Solution :
 * Quick Sort is a divide-and-conquer algorithm like the Merge Sort.
 * But unlike Merge sort, this algorithm does not use any extra array for sorting.
 * The algorithm basically repetition of 2 steps.
 * 1. Choosing the pivot and placing it in correct position in the sorted array.
 * 2. Move smaller elements to the left of the pivot and the larger elements to the right of the pivot
 */
import java.util.Arrays;


public class QucikSort {

	
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			
			int pIndex = partition(arr,low,high);
			quickSort(arr,low,pIndex-1);
			quickSort(arr,pIndex+1,high);
			
		}
		
	}
	
	public static int partition(int[] arr, int low,int high) {
		
		int pivot = low;
		int i=low,j= high;
		while(i<j) {
			while(arr[i]<=arr[pivot] && i<high)
				i++;
			while(arr[j]>arr[pivot] && j>low)
				j--;
			if(i<j) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j]= arr[pivot];
		arr[pivot] = temp;
		pivot = j;
		
		return pivot;
	}
	
	public static void main(String args[]) {
		int[] arr = {7,72,90,21,60};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
