class Solution {
    public int[] buildArray(int[] nums) {
        int a= nums.length;
        int[] ans= new int[a];
        for(int i=0; i<nums.length;i++){
            ans[i]=nums[nums[i]];
            
        }
        return ans;
    }
}
