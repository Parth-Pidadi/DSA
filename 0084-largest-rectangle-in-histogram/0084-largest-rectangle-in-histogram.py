class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        maxA = 0
        for index, height in enumerate(heights):
            start = index
            while stack and stack[-1][1] > height:
                i, h = stack.pop()
                maxA = max(maxA, h*(index-i))
                start = i
            stack.append((start, height))
        
        for i,h in stack:
            maxA = max(maxA, h*(len(heights) -i))
        return maxA
            
                
        