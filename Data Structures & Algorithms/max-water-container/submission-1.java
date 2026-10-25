class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int low=0,high=n-1;
        int max=0;
        while(low<high)
        {
            int height=Math.min(heights[low],heights[high]);
            int width=high-low;
            int area=height*width;
            max=Math.max(max,area);
            if(heights[low]>heights[high])
                high--;
            else
                low++;
        }
        return max;
    }
}
