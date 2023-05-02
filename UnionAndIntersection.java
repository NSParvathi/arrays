package arrays.easy;

import java.util.ArrayList;

public class UnionAndIntersection {

	/*
	 * Approach: Take two pointers let’s say i,j pointing to the 0th index of arr1
	 * and arr2. Create a empty vector for storing the union of arr1 and arr2. Let’s
	 * traverse the arr1 and arr2 using pointers i and j and insert the distinct
	 * elements found into union vector.
	 * 
	 * While traversing we may encounter three cases.
	 * 
	 * arr1[ i ] == arr2[ j ] Here we found a common element, so insert only one
	 * element in the union. Let’s insert arr[i] in union and increment i.
	 * 
	 * arr1[ i ] < arr2[ j ] arr1[ i ] < arr2[ j ] so we need to insert arr1[ i ] in
	 * union.IF last element in union vector is not equal to arr1[ i ], then insert
	 * in union else don’t insert. After checking Increment i. arr1[ i ] > arr2[ j ]
	 * arr1[ i ] > arr2[ j ] so we need to insert arr2[ j ] in union. IF the last
	 * element in the union vector is not equal to arr2[ j ], then insert in the
	 * union, else don’t insert. After checking Increment j. After traversing if any
	 * elements are left in arr1 or arr2 check for condition and insert in the
	 * union.
	 */

	public static ArrayList<Integer> union(int[] arr1, int[] arr2, int n, int m) {
			ArrayList<Integer> union = new ArrayList<>();
	
			int i = 0, j = 0;
			while (i < n && j < m) {
				if (arr1[i] <= arr2[j]) {
					if (union.size() == 0 || arr1[i] != union.get(union.size() - 1))
						union.add(arr1[i]);
					i++;
				} else {
					if (union.size() == 0 || arr2[j] != union.get(union.size() - 1))
						union.add(arr2[j]);
					j++;
				}
			}
			while (i < n) {
				if (union.get(union.size() - 1) != arr1[i])
					union.add(arr1[i]);
				i++;
			}
	
			while (j < m) {
				if (union.get(union.size() - 1) != arr2[j])
					union.add(arr2[j]);
				j++;
			}
			return union;
	}

	/* In intersection we move both the pointers if arr1[i] == arr2[j]. If arr1[i1<arr2[j] we have to increment i as 
	 * array elements are in sorted order no need to search remaining elements of array2 else increment j
	 */
	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int n, int m) {
		ArrayList<Integer> union = new ArrayList<>();

		int i = 0, j = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j])
				i++;
			else if (arr1[i] > arr2[j])
				j++;
			else if (arr1[i] == arr2[j]) {
				union.add(arr1[i]);
				i++;
				j++;
			}
		}
		return union;
	}

	public static void main(String args[]) {
		int[] arr1 = { 1, 35 };
		int[] arr2 = { 6, 9, 13, 15, 20, 25, 29, 46 };
		System.out.println(union(arr1, arr2, arr1.length, arr2.length));
		System.out.println(intersection(arr1, arr2, arr1.length, arr2.length));
	}
}
