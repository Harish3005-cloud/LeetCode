class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            boolean isEven=(mid%2==0);
            if(isEven){
                if(nums[mid]==nums[mid+1]){
                    low=mid+2;
                }
                else{
                    high=mid;
                }
            }else{
                if(nums[mid]==nums[mid-1]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }
        }
        return nums[low];
    }
}