class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        result[0] = findrange(nums, target, true);
        result[1] = findrange(nums, target, false);

        return result;

    }

    private int findrange(int nums[],int target,boolean isFirst){
        int ans=-1;
        int l=0 , r=nums.length-1 ;
        while(l<=r){
           int mid=l+(r-l)/2;
         if(nums[mid]==target){
            ans=mid;
            if(isFirst){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
         }else if(nums[mid]<target){
            l=mid+1;
         }else{
            r=mid-1;
         }
        }
        return ans;
       
    }
}