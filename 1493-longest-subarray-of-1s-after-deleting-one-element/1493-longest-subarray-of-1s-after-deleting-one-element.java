class Solution {
    public int longestSubarray(int[] nums) {
       int l=0;
       int max=0;
       int zcount=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zcount++;
        }
        while(zcount>1){
            if(nums[l]==0){
                zcount--;
            }
            l++;
        }
        max=Math.max(max,i-l);

       }
       return max; 
    }
}