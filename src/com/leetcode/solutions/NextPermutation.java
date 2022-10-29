package com.leetcode.solutions;

import java.util.Arrays;

//problem: https://leetcode.com/problems/next-permutation/
//explanation: https://www.youtube.com/watch?v=LuLCLgMElus&ab_channel=takeUforward
/*1. find first index i such that the value of arr[i]<arr[i+1] 
 *    while traversing from right to left <--- (store that value of i as index1) 

2. again traverse from right to left such that value of arr[index1]>arr[i] store it as index2
    <--- (store the value of i as index2)

3.swap the value at index1 with index2  (swap)

4. reverse everything from [index1] to the end of the array*/
public class NextPermutation {
	public static void main(String args[]) {
		int nums[]={1,2,3};
		nums=nextPermutation(nums);
		System.out.println(nums);
	}

	public static int[] nextPermutation(int[] nums) {
		//step1 find the first index1 where nums[i]
		int index1=0,index2=0;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				index1=i;
			}
		}
		//step2 find nums[index1]>nums[i]
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[index1]>nums[i]) {
				index2=i;

			}
		}
		
		//step3 swap nums[index1] with nums[index2]
		int temp=nums[index1];
		nums[index1]=nums[index2];
		nums[index2]=temp;
		
		//reverse he array from index1+1 to the end
		int p=nums.length-1;
		for(int i=index1+1;i<(nums.length-index1+1)/2;i++) {
			int x=nums[i];
			nums[i]=nums[p];
			nums[p]=x;
			p--;
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
