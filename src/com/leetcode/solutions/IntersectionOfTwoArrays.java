package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Intersection of two arrays
 * solution : https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/868543814/?envType=study-plan&id=data-structure-i
 * Question : https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=study-plan&id=data-structure-i*/
public class IntersectionOfTwoArrays {

	public static void main(String[] args)throws Exception {
		System.out.println(Arrays.toString(new Solution1().intersect(new int[]{1,2,2,1}, new int[]{2,2})));
		System.out.println(Arrays.toString(new Solution1().intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
	}


}


class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
    	List<Integer> intersection = null;
    	Map<Integer,Integer> map;
    	try {
	    	if(nums1.length>nums2.length) {
	    		map=mapify(nums1);
	    		intersection=findIntersection(nums2, map);
	    		
	    	}
	    	else {
	    		map=mapify(nums2);
	    		intersection=findIntersection(nums1, map);
	    	}
	    	return intersection.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    	}
    	catch(NullPointerException e) {
    		System.out.println(e.getMessage());
    	}
    	return null;
    }

	private List<Integer> findIntersection(int[] nums2,  Map<Integer, Integer> map) {
		List<Integer> intersection=new ArrayList<>();
		for(int num:nums2) {
			if(map.containsKey(num)&&map.get(num)!=0) {
				
				intersection.add(num);
				map.put(num,map.get(num)-1);
			}
		}
		return intersection;
	}

	private Map<Integer, Integer> mapify(int[] nums1) {
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int num:nums1) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		return map;
	}
}
