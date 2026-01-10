class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int merged[] = new int[m + n];
        int p1 = 0, p2 = 0, i = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                merged[i++] = nums1[p1++];
            } else {
                merged[i++] = nums2[p2++];
            }

        }
        while (p1 < m) {
            merged[i++] = nums1[p1++];
        }
        while (p2 < n) {
            merged[i++] = nums2[p2++];
        }
        int totalmed = m + n;
        if (totalmed % 2 == 1) {
            return merged[totalmed / 2];

        } else {
            return (merged[totalmed / 2 - 1] + merged[totalmed / 2]) / 2.0;
        }

    }
}