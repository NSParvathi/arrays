package arrays.easy;
/*
 * Problem Statement: Given an array of N integers and an integer D, left rotate the array by D place.
 */
import java.util.Arrays;

public class LeftRotateByDPlaces {
   /*
    * Approach:
    * First, we will perform (d%n) to get the effective number of rotations.
	* We will store the first d elements in a temporary array.
	* We will shift the last (n-d) elements by d places to the left using a loop(say i) that will start from index 0 and run up to index n-d 	
	* Inside the loop, the shifting will be like: arr[i] = arr[i+d].
	* After that, we will place the elements of the temporary array in the last d places of the given array using another loop
	*/
	public static void leftRotate(int[] arr,int d,int n) {
		if(n==0)
			return;
		d = d%n;
		if(d==0)
			return;
		
		//Take another array of size D
		int[] temp = new int[d];
		for(int i=0;i<d;i++) {
			temp[i] = arr[i];
		}
		
		// shift the arr[] elements 'd' places left side
		for(int i=0;i<n-d;i++) {
		 arr[i] = arr[i+d];	
		}
		
		// copy the d elements from the temp array to the end of the array
		for(int i=0;i<d;i++) {
			arr[n-d+i] = temp[i];
		}
	}
	
	/*
	 * This is a straightforward method. The steps are as follows:
	 * Step 1: Reverse the subarray with the first d elements (reverse(arr,0,d-1)).
	 * Step 2: Reverse the subarray with the last (n-d) elements (reverse(arr,d,n-1)).
	 * Step 3: Finally reverse the whole array (reverse(arr, 0,n)).
	 */
	public static void leftRotate_eff(int[] arr,int d,int n) {
		
		if(n==0)
			return;
		d = d%n;
		if(d==0)
			return;
		
		//Reverse first d elements that means index ranges from 0 to d-1
		reverse(arr,0,d-1);
				
		//Reverse next n-d elements index ranges from d to n-1
		reverse(arr,d,arr.length-1);
				
		//Reverse the whole array
		reverse(arr,0,arr.length-1);
	}
	
	public static void reverse(int[] arr,int start,int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		leftRotate(arr,3,arr.length);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = {2,3,4,5,6,7,8,9};
		leftRotate_eff(arr1,3,arr.length);
		System.out.println(Arrays.toString(arr1));
	}
	
}
