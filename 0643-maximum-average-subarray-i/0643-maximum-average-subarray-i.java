class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int j=k;j<nums.length;j++){
            sum+=nums[j]-nums[j-k];
            max=Math.max(sum,max);
        }
        return max/k; 
    }
}