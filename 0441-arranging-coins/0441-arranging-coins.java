class Solution {
    public int arrangeCoins(int n) {
        int coin = n;
        for(int i=1; i<=n;i++){
            coin-=i;
            if(coin<0){
                return i-1;
            }
            if (coin == 0){
                return i;
            }
        }
        return -1;
    }
}