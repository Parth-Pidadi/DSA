class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
               
            }else{
                 i++;
                
            }
            
        }
        List<Integer> ans = new ArrayList<>(); 
        for (int a=0; a < nums.length; a++){
            if (nums[a] != a+1){
                ans.add(a+1);
                
            }
        }
        return ans;
        
        
        
        
    }
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}