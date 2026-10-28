class Solution {
    public boolean isPalindrome(String t) {
        
        t=t.toLowerCase();
        int left=0,right=t.length()-1;
        while(left<t.length() && right>=0 && left<=right)
        {
            if(!Character.isLetterOrDigit(t.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(t.charAt(right)))
                right--;
            else if(t.charAt(left)!=t.charAt(right))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
