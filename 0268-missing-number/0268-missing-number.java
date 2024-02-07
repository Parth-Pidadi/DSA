class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct =  nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
                
            }
            
            
        }
        for( int a= 0; a < nums.length; a++){
                if (nums[a] != a){
                    return a;
                }
            }
            return nums.length;
        
    }
    
    public void swap(int[] arr, int first, int next) {
        int temp = arr[first];
        arr[first] = arr[next];
        arr[next] = temp;
    }
    
}