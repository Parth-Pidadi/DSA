class Solution {
    int steps = 0;

    public int numberOfSteps(int num) {
        if(num == 0){
            return steps;
        }
        if (num % 2 ==0){
            steps+=1;
            return numberOfSteps(num/2);
        }
        steps+=1;
        return numberOfSteps(num-1);
        
    }
}