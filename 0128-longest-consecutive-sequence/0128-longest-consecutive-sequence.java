class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currnum = num;
                int currstreak = 1;

                while (set.contains(currnum + 1)) {
                    currnum += 1; 
                    currstreak += 1;

                }
                longest = Math.max(longest, currstreak);
            }

        }
        return longest;
    }
}