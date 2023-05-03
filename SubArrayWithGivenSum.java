package arrays.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayWithGivenSum {

	/** BruteForce Approach
	 * iterate from i =0 to n-1 and get all the sub arrays starts with i using inner loop and 
	 * return whose sub array sum is equal to given value and it should be the longest sub array.
	 * 
	 * Time Complexity : O(n^2).
	 * @param arr
	 */
	public static void longestSubArray(int[] arr, int k) {
		int n = arr.length;
		int sum =0,length=0;
		for(int i=0;i<n;i++) {
			sum =0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum == k) {
					
					length = Math.max(length, j-i+1);					
					}
					
				}
			}
		
		System.out.println(length);		
	}
	
	/**
	 *  Optimized Approach: Using HashMap
	 *  The steps are as follows:

	*   1. First, we will declare a map to store the prefix sums and the indices.
	*   2. Then we will run a loop(say i) from index 0 to n-1(n = size of the array).
	*   3. For each index i, we will do the following:
	*   	a. We will add the current element i.e. a[i] to the prefix sum.
	*		b. If the sum is equal to k, we should consider the length of the current subarray i.e. i+1. We will compare this length with the
	*		   existing length and consider the maximum one.
	*		c. We will calculate the prefix sum i.e. x-k, of the remaining subarray.
	*   	d. If that sum of the remaining part i.e. x-k exists in the map, we will calculate the length i.e. i-hashMap.get(x-k), and consider
	*   	   the maximum one comparing it with the existing length we have achieved until now.
	* 		e. If the sum, we got after step 3.a, does not exist in the map we will add that with the current index into the map.
	* 		   We are checking the map before insertion because we want the index to be as minimum as possible and so we will consider the 
	* 		   earliest index where the sum x-k has occurred
	* 
	* 		Time Complexity  : O(n)
	* 		Space Complexity : O(n^2)
	*/
	public static int longest(int[] arr,int k) {
		
		Map<Integer,Integer> hashmap = new HashMap<>();
		
		int sum =0;
		int longest =0;
		for(int i= 0;i<arr.length;i++) {
			sum+= arr[i];
			
			if(sum == k) {
				longest = Math.max(longest, i+1);
			}
			
			int rem = sum-k;
			
			if(hashmap.containsKey(rem)) {
				longest = Math.max(longest, i-hashmap.get(rem));
			}
			
			if(!hashmap.containsKey(sum)) {
				hashmap.put(sum, i);
			}
		}
		
		return longest;
	}
	
	public static void main(String args[]) {
		int[] arr= {-1,1,1};
		int k = 1;
		System.out.println(longest(arr,k));
	}
}
