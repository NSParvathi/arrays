package arrays.easy;
/*
 * Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
 */
public class MaxConseOnes {

	/*
	 *  We maintain a variable count that keeps a track of the number of consecutive 1’s while traversing the array. 
	 *  The other variable max maintains the maximum number of 1’s, in other words, it maintains the answer.
	 * 	We start traversing from the beginning of the array. Since we can encounter either a 1 or 0 there can be two situations:-
		If  the value at the current index is equal to 1 we increase the value of count by one.
		If the value at the current index is equal to zero and if the count is not zero then we make the variable count as 0 
		since there are no more consecutive ones and update the max.
	 */
	public static int maxOnes(int[] arr) {
		int max =0;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1 && count!=0 ) {
				max = Math.max(count, max);
				count=0;
			}else if(arr[i]==1) {
				count++;
			}
		}
		max = Math.max(count, max);
		return max;
	}
	
		
	public static void main(String args[]) {
		int[] arr = {1,0,0,1,1,1,0,0,1,1,1,1};
		System.out.println(maxOnes(arr));
	}
}
