# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        slow = head
        fast = head.next
        while fast and fast.next :
            slow = slow.next
            fast = fast.next.next
            
        s = slow.next
        prev = slow.next = None
        while s:
                temp = s.next
                s.next = prev
                prev = s
                s = temp
            
        first, second = head, prev
        while second :
                temp1, temp2 = first.next, second.next
                first.next = second
                second.next = temp1
                first = temp1
                second = temp2
                
                
        """
        Do not return anything, modify head in-place instead.
        """
        