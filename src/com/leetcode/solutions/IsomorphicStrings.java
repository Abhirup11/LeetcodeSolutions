package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1
public class IsomorphicStrings {
	public static void main(String args[])throws Exception {
		System.out.println(isIsomorphic("paper","title"));
	}

	private static boolean isIsomorphic(String s, String t) {
		// TODO Auto-generated method stub
		Map<Character,Character> mapping=new HashMap<Character,Character>();
        Map<Character,Boolean> used=new HashMap<Character,Boolean>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!mapping.containsKey(ch)&&!used.containsKey(t.charAt(i))){
                mapping.put(ch,t.charAt(i));
                used.put(t.charAt(i),true);
            }
            else if(mapping.containsKey(ch)&&mapping.get(ch)!=t.charAt(i))
                return false;
            
            if(!mapping.containsKey(ch)&&used.containsKey(t.charAt(i)))
                return false;
                
        }
        return true;
		
	}
}
