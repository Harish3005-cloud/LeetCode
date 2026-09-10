class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l =0;
        int r = n-1;
        int maxwater = 0;
        int lmax = 0;
        int rmax = 0;
        while(l<r){
            lmax= Math.max(height[l],lmax);
            rmax = Math.max(height[r],rmax);
            if(height[l]<height[r]){
                maxwater+=lmax-height[l];
                l++;
            }
            else{
                maxwater +=rmax - height[r];
                r--;
            }

        }
        return maxwater;
    }
}