class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int low=1;
    int high=0;
    for(int pile:piles){
        high=Math.max(high,pile);
    }
    while(low<=high){
        int mid=low+(high-low)/2;
        
        long time=0;
        
        for(int i=0;i<piles.length;i++){
            time+=(int)Math.ceil((double)piles[i]/mid);

        }
        if(time>h){
            low=mid+1;
            }
            else{
                high=mid-1;
            }
    }
    return low;
    }

}
