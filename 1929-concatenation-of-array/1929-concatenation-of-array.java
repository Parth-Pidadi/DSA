class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length*2;
        int[] ans= new int[n];
        for(int i =0; i<nums.length; i++) {
            ans[i]=nums[i];
            
        
        }
        for(int j=nums.length; j<n;j++){
            ans[j]=nums[j-nums.length];
        }
        return ans;
    }
}