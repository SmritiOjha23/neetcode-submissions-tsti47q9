class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        String res="";
        int i=0;
        for(i=0;i<Math.min(l1,l2);i++)
        {
            res=res+word1.charAt(i)+word2.charAt(i);
        }
        for(int j=i;j<l1;j++)
        {
            res=res+word1.charAt(j);
        }
        for(int j=i;j<l2;j++)
        {
            res=res+word2.charAt(j);
        }
        return res;
    }
}