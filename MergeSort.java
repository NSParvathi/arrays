package sortings;

import java.util.Arrays;
/*
 * Problem:  Given an array of size n, sort the array using Merge Sort.
 * 
 * Solution : Merge sort follows Divide and Conquer Strategy.
 * Divide the array into two parts recursively until the size of the array is 1 and do merging. While merging we will arrange them 
 * in sorted way.
 * There are 2 main functions
 * 1. merge() : This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted
 *  and merges both of them.
 * 2. mergeSort() This function divides the array into 2 parts. low to mid and mid+1 to high where,
 		low = leftmost index of the array
 		high = rightmost index of the array
 		mid = Middle index of the array  
 * 
 */
public class MergeSort {

	public static void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	
	public static void merge(int[] arr,int low,int mid, int high) {
		int[] temp1 = new int[mid-low+1];
		int[] temp2 = new int[high-mid];
		for(int i=low,j=0; i<=mid;i++,j++) {
			temp1[j] = arr[i];
		}
		
		for(int i=mid+1,j=0;i<=high;i++,j++) {
			
			temp2[j] = arr[i];
			
		}
		System.out.println(Arrays.toString(temp2));
		
		// Code to merge two sorted arrays
		int i=0,j=0, k=low;
		while(i<temp1.length && j<temp2.length) {
			
			if(temp1[i] <=temp2[j]) {
				arr[k] = temp1[i];
				i++;
				k++;
			} else {
				arr[k] = temp2[j];
				j++;
				k++;
			}
		}
		while(i<temp1.length) {
			arr[k++] = temp1[i++];
		}
		while(j<temp2.length) {
			arr[k++] = temp2[j++];
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {6,2,8,3,1,5,4,3};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));	
	}
}
