package com.leetcode.solutions;
class SubsequenceString {
	public static void main(String args[])throws Exception {
		System.out.println(isSubsequence("aaaaaa","bbaaaa"));
	}
    public static boolean isSubsequence(String s, String t) {
        int lastUsedIndex=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean found=false;
            for(int j=lastUsedIndex+1;j<t.length();j++){
                if(ch==t.charAt(j)){
                    found=true;
                    lastUsedIndex=j;
                    break;
                }
            }
            if(!found)
                return false;
        }
        return true;
    }
}