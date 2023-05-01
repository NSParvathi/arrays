package arrays.easy;
/**
 * Problem Statement:  Given an array, we have to find the largest element in the array
 * @author Sravani
 *
 */
public class LargestElement {

	public static int largest(int[] arr) {
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}
	
	public static void main(String args[]) {
		int[] arr = {2,1,6,4,8,3,5,4,7,9};
		System.out.println(largest(arr));
	}
}
