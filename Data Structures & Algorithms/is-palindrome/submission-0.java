class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        s=s.toLowerCase();
        while(low<high)
        {
            
            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }

            // skip non-alphanumeric from right
            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
