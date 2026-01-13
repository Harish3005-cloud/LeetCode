#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if (matrix.empty() || matrix[0].empty()) return false;
        int m = matrix.size();
        int n = matrix[0].size();

        for (int i = 0; i < m; ++i) {
            // If target is outside this row's range, skip the row
            if (target < matrix[i][0] || target > matrix[i][n-1]) continue;

            // Binary search inside row i
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] > target) r = mid - 1;
                else l = mid + 1;
            }
            // if not found in this row, continue to next row
        }

        return false;
    }
};