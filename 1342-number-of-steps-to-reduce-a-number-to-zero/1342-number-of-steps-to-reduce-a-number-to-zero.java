class Solution {
    int count = 0;
    public int numberOfSteps(int num) {
        if(num == 0) {
            return count;
        }
        
        if(num%2 == 0) {
            num = num/2;
            count++;
        }
        
        else if(num%2 != 0) {
            num = num - 1;
            count++;
        }
        
        return numberOfSteps(num);
    }
}