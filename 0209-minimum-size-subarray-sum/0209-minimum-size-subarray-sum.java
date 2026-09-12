class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int n = nums.length;
     int l = 0;
     int minlen=Integer.MAX_VALUE;
     int total =0;
     for(int i=0;i<n;i++){
         total+=nums[i];
        while(total>=target){
            minlen=Math.min(i-l+1,minlen);
            total -=nums[l];
            l++;
        } 
     }
     return (minlen==Integer.MAX_VALUE)?0:minlen;   
    }
}