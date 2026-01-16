class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r){
            int midIdx=l+(r-l)/2;
            int row=midIdx/n;
            int col=midIdx%n;
            int midv=matrix[row][col];
            if(midv==target){
                return true;
            }
            else if(midv<target){
                l=midIdx+1;
            }
            else{
                r=midIdx-1;
            }
        }
        return false;
    }
}