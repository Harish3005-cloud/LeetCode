class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<=n-1;j++){
                curr_sum+=nums[j];
            if(curr_sum==k){
                count++;
            }
            }

        }
        return count;
    }
}