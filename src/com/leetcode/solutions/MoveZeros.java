package com.leetcode.solutions;

import java.util.Arrays;

/*https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75*/
public class MoveZeros {

	public static void main(String[] args) throws Exception {
		//int arr[] = { 0, 1, 0, 3, 12 };
		int arr[] = { 0 };
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] nums) {
		int x=0,y=0;
		while(y<nums.length) {
			if(nums[y]!=0) {
				int temp=nums[x];
				nums[x]=nums[y];
				nums[y]=temp;
				x++;
				y++;
			}
			else
				y++;
			
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
