/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current =head;
        while(current != null){
            ListNode Data = current;
                    while(Data.next != null){
                        if(Data.next.val == current.val){
                            Data.next = Data.next.next;
                        }else{
                            Data = Data.next;
                        }
                }
            current = current.next;
        }   
         
         return head;

    }  
}
