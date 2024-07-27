class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int n = apple.length;
        int m = capacity.length;
        int numapples = 0;
        int answer=0;
        
        for(int i=0; i<n; i++)
        {
            numapples = numapples + apple[i];
        }
        
        int last = capacity[m-1];
        if(numapples < last)
        {
            answer = 1;
        }
        
        int count = 1;
        int numcapacity = 0;
        
        for(int i=m-1; i>=0; i--)
        {
            numcapacity = numcapacity + capacity[i];
            if(numcapacity >= numapples)
            {
                answer = count;
                break;
            }
            count++;
        }
        return answer;
    }
}