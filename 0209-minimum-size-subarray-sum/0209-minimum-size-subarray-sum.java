class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0;
        int curr=0;
        int minlen=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            curr+=nums[r];
            while(curr>=target){
                minlen=Math.min(minlen,r-l+1);
                curr-=nums[l];
                l++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
}