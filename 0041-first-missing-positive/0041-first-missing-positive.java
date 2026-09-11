class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Step 1: Convert all <= 0 to n + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark existing numbers
        for (int i = 0; i < n; i++) {

            int val = Math.abs(nums[i]);

            if (val >= 1 && val <= n) {
                nums[val - 1] = -Math.abs(nums[val - 1]);
            }
        }

        // Step 3: Find first positive value
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}