class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
               
            }else{
                 i++;
                
            }
            
        }
        int ans = 0;
        for (int a=0; a < nums.length; a++){
            if (nums[a] != a+1){
               return nums[a];
                
            }
        }
        return -1;
        
        
        
        
    }
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        
    }
}