class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length - 1;
        int finalarea = 0;
        while(l<r)
        {
            int min = (height[l]<height[r])?height[l]:height[r];
            int area = min*(r-l);
            if(area > finalarea)
            {
                finalarea = area;
            }
            if(height[l] < height[r])
            {
                l++;
            }
            else if(height[l] >= height[r])
            {
                r--;
            }
        }
        return finalarea;
    }
}