# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        ans = 0
        prev = None
        curr = head
        while curr :
            nxt = curr.next
            curr.next = prev
            prev = curr 
            curr = nxt
        i =0
        while prev:
            ans = ans + prev.val * 2 ** i
            prev = prev.next
            i+=1
        return ans
            
            
            
