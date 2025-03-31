/*
Problem 1: 
Given an array of integers, perform the following operations: 
1. Find the second largest element in the array. 
2. Move all zeros to the end of the array while maintaining the order of non-zero 
elements. 
Input: 
arr = [10, 0, 5, 20, 0, 8, 15] 
Output: 
Second largest element: 15   
Array after moving zeros: [10, 5, 20, 8, 15, 0, 0] 
Constraints: 
● Do not use built-in sort functions. 
● The array may contain duplicate elements or zeros at any position. 
● Array length ≥ 2.
*/

import java.util.Arrays;
class Assign01{
	static int secondLarge(int arr[]){
		int large = Integer.MIN_VALUE;
		int sLarge = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>large){
				sLarge = large;
				large = arr[i];
			}else if(arr[i]>sLarge && sLarge<large){
				sLarge = arr[i];
			}
		}
		return sLarge;
	}
	static int[] moveZero(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==0 && arr[j] != 0){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					break;
				}
			}
			
		}
		return arr;
	}
	public static void main(String[] args){
		int arr[] = {10, 0, 5,0,0, 12,0,24, 20, 0, 8, 15};
		int sLarge = secondLarge(arr);
		System.out.println("Second largest element: "+sLarge);
		System.out.println("Array after moving zeros: "+Arrays.toString(moveZero(arr)));
		
	}
}