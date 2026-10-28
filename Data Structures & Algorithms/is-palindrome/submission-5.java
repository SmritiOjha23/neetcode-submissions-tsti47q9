class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                t=t+s.charAt(i);

        }
        int left=0,right=t.length()-1;
        while(left<t.length() && right>=0 && left<=right)
        {
            if(t.charAt(left)!=t.charAt(right))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
