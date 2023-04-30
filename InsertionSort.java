package sortings;

import java.util.Arrays;

/*
 * Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.
 * 
 * In insertion sort we maintain two parts of the given array.one is sorted part and another is unsorted part. Take one element
 * from unsorted array and insert in correct position in sorted array. Iterate the array until all the elements are sorted.
 * Below are the steps to be followed 
 * 1. Select an element in each iteration from an unsorted array.
 * 2. place the element in its corresponding position in a sorted part and shift remaining elements accordingly.
 * 3. Inner while loop basically shifts the elements using swapping.
 */
public class InsertionSort {

	static void insert(int arr[],int i)
	  {
	       // Your code here
		 int j=i;
		 while(j>0 && arr[j-1]>arr[j]) {
			 int temp = arr[j-1];
			 arr[j-1] = arr[j];
			 arr[j] = temp;
			 j--;
		 }
	  }
	  //Function to sort the array using insertion sort algorithm.
	  public static void insertionSort(int arr[], int n)
	  {
	      //code here
		  for(int i=0;i<n;i++) {
			insert(arr,i);
		  }
	  }
	  
	  public static void main(String args[]) {
		  int[] arr = {4,1,6,3,9,2,7};
		  insertionSort(arr,arr.length);
		  System.out.println(Arrays.toString(arr));
	  }
}
