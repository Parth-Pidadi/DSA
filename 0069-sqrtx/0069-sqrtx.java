class Solution {
    public int mySqrt(int target) {
        int start = 1;
        int end = target;

        while (start <= end){
            int mid = start + (end-start)/2;
            if ( target / mid  < mid){
                end = mid - 1 ;
            }else if (target / mid > mid ){
                start = mid + 1  ;
            }else {
                return mid;
            }
        }
        return end;
        
        
    }
}