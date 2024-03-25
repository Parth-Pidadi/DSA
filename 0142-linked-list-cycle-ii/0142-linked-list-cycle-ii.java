/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        int length  = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
              slow = head;
              while( slow != fast)
              {
                  fast = fast.next;
                  slow = slow.next;
              }
            //     length = cycleLength(slow);
            //     break;
            // }
             return slow;
           }
        
        }
        // if(length == 0) return null;
        // //find the start node;
        // ListNode f = head;
        // ListNode s = head;
        // while(length > 0)
        // {
        //     s = s.next;
        //     length--;
        // }

        // //keep moving both forward and they will meet at cycle start
        // while(f != s)
        // {
        //     s = s.next;
        //     f = f.next;
        // }
        return null;
        
    }
   
    // public int cycleLength(ListNode head)
    // {    
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     while(fast != null && fast.next != null)
    //     {
    //         fast = fast.next.next;
    //         slow = slow.next;
    //         if(fast == slow)
    //         {
    //             //calculate the length of cycle
    //             ListNode temp = slow;
    //               int length = 0;
    //               do{
    //                   temp = temp.next;
    //                   length++;
    //               }
    //               while(slow != temp);
    //               return length;

    //         }
    //     }
    //     return 0;
    // }
}