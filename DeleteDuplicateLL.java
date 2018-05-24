/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode A =head;
       
        while(A!=null && A.next!=null )
        {
            
        if(A.next.val==A.val)
        {
            A.next= A.next.next;
        }
            else{
            A = A.next;
            }
        }
        return head;
        
        
        
    }
}