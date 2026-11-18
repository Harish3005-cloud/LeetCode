class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int len =0;
        int longest=0;
        HashSet<Integer> set= new HashSet<>();
        for(int n1:nums){
            set.add(n1);
        }
        for(int val:set){
            if(!set.contains(val-1)){
                len=0;
                while(set.contains(val+len)){
                    len+=1;
                    longest =Math.max(len,longest);
                }
            }
        }
        return longest;
    }
}