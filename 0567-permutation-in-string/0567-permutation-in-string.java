class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int []s1counts=new int [26];
        int []s2counts=new int[26];
        for(int i=0;i<s1.length();i++){
            s1counts[s1.charAt(i)-'a']++;
            s2counts[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(matches(s1counts , s2counts)) return true;
            s2counts[s2.charAt(i+s1.length())-'a']++;
            s2counts[s2.charAt(i)-'a']--;
        }
        return matches(s1counts,s2counts);

    }
    private boolean matches(int s1counts[] , int s2counts[]){
        for(int i=0;i<26;i++){
            if(s1counts[i]!=s2counts[i]){
                return false;
            }
         
        }
           return true;
    }
}