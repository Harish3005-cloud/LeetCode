class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        if(s.length ()!=t.length()){
            return 0;
        }
       
        int n=s.length();
        int res=0;
        int l=0;
        int curr=0;
    
        for(int r=0;r<n;r++){
            curr+=Math.abs(s.charAt(r)-t.charAt(r));
            while(curr>maxCost){
                curr-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            res=Math.max(res,r-l+1);
        }
    return res;
    }
}