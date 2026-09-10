class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int leftmax=0;
        int rightmax=0;
        int totalwater=0;
        while(l<r){
        leftmax=Math.max(leftmax,height[l]);
        rightmax=Math.max(rightmax,height[r]);
        if(leftmax<rightmax){
            totalwater+=leftmax-height[l];
            l++;
        }
        else{

            totalwater+=rightmax-height[r];
            r--;
        }
    }
        return totalwater;     
    }
   
}