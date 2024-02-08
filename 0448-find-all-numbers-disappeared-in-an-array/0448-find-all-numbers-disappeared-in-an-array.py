class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
            
        def swap(arr, i, j):
            arr[i], arr[j] = arr[j], arr[i]
        i = 0
        while i<len(nums):
            correct= nums[i]-1
            if nums[i] == nums[correct]:
                i+=1
            else:
                swap(nums, i, correct)
        
        result=[]
        for i in range(len(nums)):
            if nums[i] != i+1:
                result.append(i+1)
        return result 
            
    