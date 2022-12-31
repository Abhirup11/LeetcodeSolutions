/**
 * 
 */
package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Abhirup
 * Given an array of integers nums and an integer target, return 
 * indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, 
   and you may not use the same element twice.
   You can return the answer in any order.
 *
 *Solution : https://www.youtube.com/watch?v=dRUpbt8vHpo&ab_channel=takeUforward
 *Question: https://leetcode.com/problems/two-sum/submissions/868523750/?envType=study-plan&id=data-structure-i
 */
public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().twoSum(new int[] {2,7,11,15}, 9)));
		System.out.println(Arrays.toString(new Solution().twoSum(new int[] {3,2,4}, 6)));
		System.out.println(Arrays.toString(new Solution().twoSum(new int[] {3,3}, 6)));
	}
	 
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map=new HashMap<>(); //Number,index 
		int arr[]=new int[2];
    	for(int i=0;i<nums.length;i++) {
    		if(map.containsKey(target-nums[i])) {
    			arr[0]=i;
    			arr[1]=map.get(target-nums[i]);
    		}
    		else {
    			map.put(nums[i], i);
    		}
    	}
    	return arr;
        
    }
}