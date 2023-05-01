package arrays.easy;
/*
 * 
 * 
 */
public class CheckArraySorted {

	/*
	 *  For a sorted array the previous of every element is smaller than or equal to its current element.
	 *  So, Through this, we can conclude that if the previous element is smaller than or equal to the current element then we can say that the
	 *  two elements are sorted. If the condition is true for the entire array then the array is sorted.
	 *  We will check every element with its next element if the current element is smaller than or equal to the next element then 
	 *  we will move to the next index.
	 *  If the whole array is traversed successfully or the size of the given array is zero or one (i.e N = 0 or N = 1).
	 *  Then we will return True else return False.
	 */
	public static boolean checkArray(int[] arr,int n) {
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,10,4,5,6,7};
		System.out.println(checkArray(arr,arr.length));
	}
}
