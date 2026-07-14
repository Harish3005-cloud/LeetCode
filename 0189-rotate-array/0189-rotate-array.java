class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int l=0;
        int r=n-1;
        while (l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
         l=0;
         r=k-1;
        while (l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
         l=k;
         r=n-1;
        while (l<r){
            swap(nums,l,r);
            l++;
            r--;
        }




}
public void swap(int [] nums,int l,int r ){
        
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
        
    }
}
