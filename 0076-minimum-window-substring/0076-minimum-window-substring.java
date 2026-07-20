class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> target= new HashMap<>();
        for(char c:t.toCharArray()){
            target.put(c,target.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> window =new HashMap<>();
        int l=0;
        int r=0;
        int formed=0;
        int stindx=0;
        int minlen=Integer.MAX_VALUE;
        int req=target.size();
        while(r<s.length()){
            char c=s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(target.containsKey(c) && target.get(c).intValue() == window.get(c).intValue()){
                formed++;
                }
                while(l<=r && formed==req){
                    c=s.charAt(l);
                    if(minlen>r-l+1){
                        minlen=r-l+1;
                        stindx=l;
                    }
                    window.put(c,window.get(c)-1);
                    if(target.containsKey(c) && window.get(c).intValue()<target.get(c).intValue()){
                        formed--;

                    }
                    l++;
                }
             r++;
        }
        return minlen==Integer.MAX_VALUE ?"":s.substring(stindx,stindx+minlen);

}
}