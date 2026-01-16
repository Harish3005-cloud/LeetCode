class Solution {
    public int maxFrequency(int[] nums, int k) {
     int n=nums.length;
     int l=0;
     int res=0;
     long total=0;
     Arrays.sort(nums);
     for(int r=0;r<n;r++){
        total+=nums[r];
        while((long)nums[r]*(r-l+1)>total+k){
            total-=nums[l];
            l+=1;
        }
        res=Math.max(res,r-l+1);
     }
     return res;   
    }
}