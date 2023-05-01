package arrays.easy;
/*
 * Given an array nums, return true if the array was originally sorted in non-decreasing 
 * order, then rotated some number of positions (including zero). Otherwise, return false.
 * There may be duplicates in the original array.
 */
public class CheckArrayRoatedSorted {

	/**
	 * We have to check 3 conditions to check given array is sorted and rotated
	 * First find the minimum element and then check below 3 conditions
	 * 1. check if all the elements before the minimum element are in increasing order
	 * 2. check if all the elements after the minimum element are in increasing order.
	 * 3. Check if the last element of the array is smaller than the starting element, 
	 * as this would make sure that the array has been rotated at least once.
	 * 
	 * This solution works then there are no duplicates
	 * @param nums
	 * @return
	 */
	 public static boolean check(int[] nums) {
	       int min = 0;
	       int n = nums.length;
	       //finding min element
	       for(int i =1;i<n;i++) {
	    	   if(nums[i] <=nums[min])
	    		   min = i;
	       }
	       
	       //checking before minimun element are sorted or no
	       for(int i=0;i<min-1;i++) {
	    	   if(nums[i]>nums[i+1]) 	    		  
	    		   return false;
	       }
	       //Checking after the minimum element are in sorted order or no
	       for(int i=min+1;i<n-1;i++) {
	    	   if(nums[i]>nums[i+1]) 	    		  
	    		   return false;
	       }
	       if(min == 0)
	    	   return true;
	       //Checking whether the first element is greater than the last element
	       if(nums[0]<nums[n-1]) 	    	  
	    	   return false;
	       
	       return true;
	    }
	 
	 /*once we reach end of the array we have to check last element with the first element
	  * that is the reason why we are selecting second element index rotationally in the if
	  * condition.
	  * 
	  * This solution works for any type of array.
	  */
	 public static boolean checkArray(int[] nums) {
		 int count = 0;
		 int n= nums.length;
		   for (int i = 0; i < n; i++) {
		      if (nums[i] > nums[(i + 1) % n])
		         count++;
		   }
		   return (count <= 1);
	 }
	 
	 public static void main(String args[]) {
		 int[] arr = {7,9,1,1,1,3};
		 System.out.println(checkArray(arr));
	 }
}
