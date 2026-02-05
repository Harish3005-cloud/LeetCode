class Solution {
    public int lengthOfLIS(int[] nums) {
        int []lts=new int[nums.length];
        int n=nums.length;
        Arrays.fill(lts,1);
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){    
                    lts[i]=Math.max(lts[i],lts[j]+1);

                }
        }
    }
    return Arrays.stream(lts).max().getAsInt();
}
}