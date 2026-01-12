class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int r= n-1;
        int l=0;
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int leftsqr=nums[l]*nums[l];
            int rightsqr=nums[r]*nums[r];
            if(leftsqr>rightsqr){
                res[i]=leftsqr;
                l++;
            }
            else{
                res[i]=rightsqr;
                r--;
            }
        }
        return res;
    }
}