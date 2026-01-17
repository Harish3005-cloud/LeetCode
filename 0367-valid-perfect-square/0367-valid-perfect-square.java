class Solution {
    public boolean isPerfectSquare(int num) {
        if (num ==1){
            return true;
        }
        long low = 1;
        long high = num / 2;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sqr=mid*mid;
            if (sqr== num) {
                return true;
            } else if (sqr < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return false;
    }
}