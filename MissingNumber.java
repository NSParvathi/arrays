package arrays.easy;
/*
 * Problem Statement : 
 * Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
 * Find the number(between 1 to N), that is not present in the given array.
 */
public class MissingNumber {
	/*
	 * Approach:
	 * 1. Find the sum of the give array elements.
	 * 2. Find the sum of N elements using the formula  N*(N+1)/2
	 * 3. Missing number =  sum of N elements- sum of the array elements
	 * 	T.C = O(n)
	 */

	public static int findMissingNum(int[] A,int N) {
		
		int sumArray =0;
		for(int i=0;i<A.length;i++) {
			sumArray += A[i];
		}
		
		int sumN = N*(N+1)/2;
		
		return sumN-sumArray;
	}
	
	/*
	 *  Using XOR operation i will compute
	 *  XOR of 0 with any number returns same number. Eg: 6 XOR 0 = 6
	 *  XOR of two same numbers equal to 0. Eg: 6 XOR 6 =0.
	 *  Approach:
	 *  Do XOR of given array elements and with the numbers from 1 to N. 
	 *  Same numbers compensate each other. Finally, the result is the missing number.
	 */
	public static int findMissNum(int A[],int N) {
		int res  = 0;
		for(int i=0;i<A.length;i++) {
		 res = res^A[i];	
		}
		
		for(int x=1;x<=N;x++) {
			res = res^x;
		}
		return res;
		 
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,4,5};
		int N= 5;
		System.out.println(findMissNum(arr,N));
	}
	
}
