class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
       
        String r="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            r=ch+r;
        }
        s=r;
         int high=s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
