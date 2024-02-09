class Solution {
    public int thirdMax(int[] nums) {
        insertion(nums);
        int elemCounted =1;
        int prevElem = nums[nums.length-1];
        for (int i= nums.length-2; i>=0; i--){
            if(nums[i] != prevElem){
                elemCounted += 1;
                prevElem = nums[i];
                
            }
            if (elemCounted == 3){
                return nums[i];
            }
            
            
                
            
            
        }
        return nums[nums.length-1];
        
               
    }
    public void insertion(int[] nums){
        for( int i= 0; i < nums.length-1; i++){
            for( int j = i+1; j>0; j-- ){
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    
    
    public void swap(int[] arr, int first, int last ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}