class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
    int l=0;
    int r=0;
    while(r<s2.length()){
        char c=s2.charAt(r);
        if(!need.containsKey(c)){
            have.clear();
            r++;
            l=r;
          continue;
        }
        
            have.put(c,have.getOrDefault(c,0)+1);
        
        
        while(have.get(c)>need.get(c)){
            char lchar=s2.charAt(l);
            have.put(lchar ,have.get(lchar)-1);
            l+=1;
        }
        int windowSize=r-l+1;
    if(windowSize==s1.length())
    {
        return true;
    }
    r+=1;
    }


return false;

    }
}