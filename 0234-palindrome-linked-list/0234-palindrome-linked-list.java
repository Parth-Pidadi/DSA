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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMid(head);
        ListNode reverse = reverse(mid);
        
        while( reverse != null){
            if (head.val  != reverse.val){
                return false;
            }
            
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = head;
        
        while (curr!= null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        
            
            
            
        }
        return prev;
    }
}