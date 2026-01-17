class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        for(int w:weights){
            l=Math.max(l,w);
            r+=w;
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(canFinish(weights,days,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean canFinish(int weights[],int days,int capacity){
        int daysused=1;
        int currLoad=0;
        for(int i:weights){
            if(currLoad+i>capacity){
                daysused++;
                currLoad=0;
            }
            currLoad+=i;
        }
        return daysused<=days;
    }
}