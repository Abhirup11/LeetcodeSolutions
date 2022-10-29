package com.leetcode.solutions;

//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
import java.util.Arrays;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
	public class MergeSortedLinkedList {
		public static void main(String[] args)throws Exception{
			ListNode list1 = makeLinkedList(Arrays.asList(0));
			ListNode list2 = makeLinkedList(Arrays.asList());
			
			ListNode mergeList = mergeTwoLists(list1, list2);
			ListNode temp = mergeList;
			while(temp!=null) {
				System.out.print(temp.val+" ");
				temp=temp.next;
			}
			
		}

		private static ListNode makeLinkedList(List<Integer> asList) {
			ListNode end=null;
			ListNode start=null;
				for(int num:asList) {
					ListNode node=new ListNode(num);
					if(start==null) {
						start=node;
						end=start;
						node.next=null;
					}
					else {
						end.next=node;
						end=node;
						node.next=null;
					}
				}
				return start;
		}
		
		
		public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode flag1=list1;
	        ListNode flag2=list2;
	       
	        ListNode start=null;
	        ListNode end=null;
	        
	        // System.out.println(list1);
	        try {
	        	while(flag1!=null&&flag2!=null){
		            if(flag1.val<flag2.val){
		                    ListNode node=new ListNode();
		                    node.val=flag1.val;
		                    if(start==null&&end==null){
		                        start=end=node;
		                    }
		                    else{
		                        
		                        end.next=node;
		                        end=node;
		                        
		                    }
		                if(flag1!=null)
		                    flag1=flag1.next;
		            }
		            else{
		                ListNode node=new ListNode();
		                node.val=flag2.val;
		                if(start==null&&end==null){
		                        start=end=node;
		                    }
		                    else{
		                        
		                        end.next=node;
		                        end=node;}
		                    
		                if(flag2!=null)
		                flag2=flag2.next;
		            }
		            
		        }
	        	if(flag1==null){
		            while(flag2!=null){
		                ListNode node=new ListNode();
		                node.val=flag2.val;
		                
		                end.next=node;
		                end=node;
		                flag2=flag2.next;
		            }
		        }
		        
		        else{
		            while(flag1!=null){
		                ListNode node=new ListNode();
		                node.val=flag1.val;
		                end.next=node;
		                end=node;
		                flag1=flag1.next;
		            }
		        }
	        	
	        }
	        catch(NullPointerException e) {
	        	System.out.println("found null pointer exception");
	        	if(flag1==null) {
	        		return flag2;
	        	}
	        	else {
	        		return flag1;
	        	}
	        }
	       
	        	        return start;
	    }
	}
