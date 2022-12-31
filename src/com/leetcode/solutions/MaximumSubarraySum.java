package com.leetcode.solutions;

import java.io.IOException;
/*
 * Kadane's Algorithm to find the maximum sum in a subarray
 * Tutorial: https://www.youtube.com/watch?v=HCL4_bOd3-4&t=565s&ab_channel=AnujBhaiya 
 * Question: https://leetcode.com/problems/maximum-subarray/submissions/868506368/?envType=study-plan&id=data-structure-i*/
class MaximumSubarraySum {

 public static int maxSubArray(int[] nums) {
		 int curSum=0,maxSum=Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 curSum=curSum+nums[i];
			 if(curSum>maxSum) {
				 maxSum=curSum;
			 }
			 if(curSum<0) {
				 curSum=0;
			 }
		 }
		 return maxSum;
		
	    }
	 
	 public static void main(String []args)throws IOException {
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})); 
		System.out.println(maxSubArray(new int[] {1})); 
		System.out.println(maxSubArray(new int[] {5,4,-1,7,8})); 
		System.out.println(maxSubArray(new int[] {-1}));
	 }
	 
	 
}
