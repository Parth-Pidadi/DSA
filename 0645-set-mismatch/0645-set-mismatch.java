class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct =  nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
                
            }
            
            
        }
        
        for( int a= 0; a < nums.length; a++){
                if (nums[a] != a+1){
                    
                    return new int[] {nums[a],a+1};
                }
        }
        return new int[] {-1,-1};
        
    }
    
    public void swap(int[] arr, int first, int next) {
        int temp = arr[first];
        arr[first] = arr[next];
        arr[next] = temp;
    }
        
    
}