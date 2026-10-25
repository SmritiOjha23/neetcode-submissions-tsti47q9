class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                rev=rev+ch;
        }
        int low=0;
        int high=rev.length()-1;
        while(low<high)
        {
            if(rev.charAt(low)!=rev.charAt(high))
                return false;
            high--;
            low++;
        }
        return true;
    }
}
