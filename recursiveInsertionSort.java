package sortings;

import java.util.Arrays;
/**
 * Problem Statement: 
 * Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.
 * 
 * Same as Iterative insertion sort code. In recursive approach i have converted outer loop as
 * recurisve call.
 * @author Sravani
 *
 */
public class RecursiveInsertionSort1 {

	public static void recursion(int[] arr,int i, int n ) {
		if(i==n)
			return;
		int j=i;
		while(j>0 && arr[j]<arr[j-1]) {
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			j--;
		}
		recursion(arr,i+1,n);
	}
	
	public static void insertionSort(int[] arr) {
		recursion(arr,0,arr.length);
	}
	
	public static void main(String args[]) {
		int[] arr = {2,6,3,1,9,3,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
