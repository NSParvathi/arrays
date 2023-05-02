package arrays.easy;

import java.util.Arrays;

public class MoveZerosToEnd {

	/*
	 * If we find a zero while traversing that means this place should be occupied by the immediate next non zero elements
	 * (so that order will be maintained for non zero elements) so we will place a pointer at zero element and 
	 * we will try to find next non-negative integer using another pointer, once it was found that means zero places 
	 * has to be occupied by this non-negative number and non-negative number will be occupied by zero.
	 */
	public static void moveZerosToEnd(int[] arr, int n) {
		int i = 0, j = 0;
		while (j < n) {
			while (arr[i] != 0 && j < n) {
				i++;j++;
				
			}
			
			if (j < n) {
				if (j > i && arr[i] == 0 && arr[j] != 0) {
					swap(arr, i, j);
				} else
					j++;
			}
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
		moveZerosToEnd(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
