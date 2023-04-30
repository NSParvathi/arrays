package sortings;

import java.util.Arrays;

public class RecursiveBubbleSort {

	public static void rec(int[] arr,int i) {
		if(i==0)
			return;
		for(int j=0;j<i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		rec(arr,i-1);
	}
	
	public static void bubbleSort(int[] arr,int n) {
		rec(arr,n-1);
	}
	
	public static void main(String args[]) {
		int[] arr = {5,1,3,2,4,6,7,8};
		bubbleSort(arr,arr.length);
		
		System.out.println(Arrays.toString(arr));
	}
}
