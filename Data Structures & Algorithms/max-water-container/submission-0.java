class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int max_area=0;
        while(low<high)
        {
            int area=Math.min(heights[low],heights[high])*(high-low);
            max_area=Math.max(max_area, area);
            if(heights[low]<heights[high])
                low++;
            else
                high--;
        }
        return max_area;
    }
}
