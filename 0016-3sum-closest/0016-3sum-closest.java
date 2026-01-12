class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int closest= nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int curr=nums[i]+nums[l]+nums[r];

                if(curr==target){
                    return curr;
                }
                if(Math.abs(target-curr)<Math.abs(target-closest)){
                    closest=curr;
                }
                if(curr<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return closest;
    }
}