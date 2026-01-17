class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res=0;
        for(int house:houses){
            int idx=Arrays.binarySearch(heaters,house);
            if(idx<0){
                idx=-(idx+1);
                
            int distright=(idx<heaters.length)? heaters[idx]-house:Integer.MAX_VALUE;
            int distleft=(idx>0) ? house-heaters[idx-1]:Integer.MAX_VALUE;
            int mindist=Math.min(distright,distleft);
            
            res=Math.max(res,mindist);
            }
        
        }
        return res;
    }
}