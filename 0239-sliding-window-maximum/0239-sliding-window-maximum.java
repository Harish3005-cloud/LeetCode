class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int maxsum[]=new int[nums.length-k+1];
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int ind=0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                maxsum[ind++]=nums[dq.peekFirst()];
            }

        
    }
    return maxsum;
     
}
}