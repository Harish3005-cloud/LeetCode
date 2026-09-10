class Solution {
    public int maxArea(int[] height) {
        int n = height.length - 1;
        int l = 0 , r = n;
     int    maxwater = 0;
        while(l<r){
            int w = r-l;
            int h =Math.min(height[l],height[r]);
            int currwater = w*h;
            maxwater = Math.max(currwater , maxwater);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxwater;
    }
}