class Solution {
    int [] prefixsum;
    int total;
    public Solution(int[] w) {
        int n = w.length;
        prefixsum = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=w[i];
            prefixsum[i]=sum;        
        }
        total=sum;
    }
    
    public int pickIndex() {
        Random random=new Random();
        double target = random.nextDouble()*total;
        int l=0 ,r=prefixsum.length -1;
        while(l<r){
            int mid= l+(r-l)/2;
            if(prefixsum[mid]<=target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */