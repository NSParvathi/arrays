package arrays.easy;

/*  Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique
 *  element appears only once. The relative order of the elements should be kept the same.
 *  
 *  I am checking the current element with the next element, if both are equal shifting remaining array elements to the left and reducing the
 *  array index size by 1. Once all the elements are done returning new index which is array size after deleting duplicate elements.
 */

public class RemoveDupFromSortedArray {

	/*I am checking the current element with the next element, if both are equal shifting remaining array elements to the left and reducing the
      array index size by 1. Once all the elements are done returning new index which is array size after deleting duplicate elements.*/
	/* The problem with this solution is that for every duplicate eleement we are shifting all the remaining elements */
	public static int removeDuplicates(int[] A,int N) {
		for(int i=0;i<N-1;i++) {
			if(A[i] == A[i+1]) {
				for(int j=i+1;j<N-1;j++) {
					A[j] = A[j+1];
					
				}
				i--;
				N--;
			}
		}
		return N;
	}
	
	//Using two pointers
	/* 	Take a variable i as 0;
		Use a for loop by using a variable ‘j’ from 1 to length of the array.
		If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
	 	After completion of the loop return i+1, i.e size of the array of unique elements.*/
	
	public static int removeDup(int[] A,int N) {
		 int i = 0;
	        for (int j = 1; j <N; j++) {
	            if (A[i] != A[j]) {
	                i++;
	                A[i] = A[j];
	            }
	        }
	        return i + 1;
	}
	
	public static void main(String args[]) {
		int[] arr = {2,3,4,5,5,6,7,8};
		int n = removeDup(arr,arr.length);
		
		for(int i =0;i <n;i++)
			System.out.print(arr[i]+" ");
		
	}
	
}
