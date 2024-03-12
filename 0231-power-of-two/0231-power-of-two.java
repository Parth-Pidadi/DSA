import java.lang.Math;
class Solution {
    public boolean isPowerOfTwo(int n) {
        // if ((Math.log(n))/(Math.log(2)) % 1 == 0.0 ){
        //     return true;
        // } else{
        //     return false;
        // }
        // System.out.println((Math.log(n))/(Math.log(2)));
        if(n<=0){
            return false;
        }
        if (n==1){
            return true;
        }
        if(n%2 !=0){
            return false;
        }
        return isPowerOfTwo(n/2);
           
    }
}