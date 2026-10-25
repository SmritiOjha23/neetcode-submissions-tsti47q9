class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }
    public int[] mergeSort(int[] nums)
    {
        int n=nums.length;
        if(n<2)
            return nums;
        int mid=n/2;
        int left[]=Arrays.copyOfRange(nums,0,mid);
        int right[]=Arrays.copyOfRange(nums,mid,n);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }
    public int[] merge(int leftarr[],int rightarr[])
    {
        int k=0;
        int left=0,right=0;
        int ans[]=new int[leftarr.length+rightarr.length];
        while(left<leftarr.length && right<rightarr.length)
        {
            if(leftarr[left]<=rightarr[right])
            {
                ans[k++]=leftarr[left];
                left++;
            }
            else
            {
                ans[k++]=rightarr[right];
                right++;
            }
        }
        while(left<leftarr.length)
        {
            ans[k++]=leftarr[left];
            left++;
        }
        while(right<rightarr.length)
        {
            ans[k++]=rightarr[right];
            right++;
        }
        return ans;
    }
}