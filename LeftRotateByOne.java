package arrays.easy;

/*
 * Problem Statement: Given an array of N integers, left rotate the array by one place.
 */
import java.util.Arrays;

public class LeftRotateByOne {

	/*
	 * At first, we have to shift the array towards the left so, we store the value of the first index in a variable (let it be x).

		Then we iterate the array from the 0th index to the n-1th index

		And then store the value present in the next index to the current index.
	 */
	public static void leftRotate(int[] arr,int n) {
		int x = arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = x;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8};
		leftRotate(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
