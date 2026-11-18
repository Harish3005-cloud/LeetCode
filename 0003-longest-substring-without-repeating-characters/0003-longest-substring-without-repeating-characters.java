class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =new HashSet<>();
        int l=0;
        int r=0;
        int maxlen =0;
        for(r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            int currlen=r-l+1;
            maxlen=Math.max(currlen,maxlen);
        }
        return maxlen;
    }
}