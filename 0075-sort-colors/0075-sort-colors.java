class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int h=n-1;
        int mid=0;
        int l=0;
        while(mid<=h){
            if(nums[mid]==0){
                swap(nums,l,mid);
                l++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,h);
                h--;
            }
        }
    }
    private static void swap(int nums[],int l,int r){
        int temp =nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        
    }
}