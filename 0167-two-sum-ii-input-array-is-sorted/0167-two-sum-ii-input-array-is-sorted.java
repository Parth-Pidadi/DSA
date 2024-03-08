class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            int[] ans = new int[2];
            int total = numbers[start] + numbers[end];
            if (total == target){
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            }else if (total < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
        
    }
}