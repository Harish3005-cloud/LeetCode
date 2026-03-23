class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int H=0;
        for(int pile:piles){
            H=Math.max(H,pile);
        }
        while(l<=H){
            int mid=l+(H-l)/2;
            long time=0;
            for(int pile:piles){
                time+=(pile+mid-1)/mid;
            }
            if(time>h){
                l=mid+1;
            }
            else{
                H=mid-1;
            }
        }
        return l;
    }
}
