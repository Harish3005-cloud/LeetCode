class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int currmin=1;
        int currmax=1;
        for(int n:nums){
            if(n==0){
                currmin=1;
                currmax=1;
                res=Math.max(res,0);
                continue;
            }
            int temp=n*currmax;
            currmax=Math.max(Math.max(n*currmax,n*currmin),n);
            currmin=Math.min(Math.min(temp,currmin*n),n);

            res=Math.max(res,currmax);
        }
        return res;
}
}