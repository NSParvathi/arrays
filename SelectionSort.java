package sortings;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int smallest = 0;
		for(int i=0;i<arr.length;i++) {
			smallest = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[smallest] > arr[j]) {
					smallest =j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {3,1,6,2,9,4,3};
		selectionSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
		int minIndex = i;
		for(int j=i;j<arr.length;j++) {
			if(arr[j] < arr[minIndex])
				minIndex = j;
		}
		return minIndex;
	}
	
	static void selectionSort(int arr[], int n)
	{
	    //code here
		for(int i=0;i<n;i++) {
			int minIndex = select(arr,i);
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
