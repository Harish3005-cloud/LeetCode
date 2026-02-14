class Solution {
    public void setZeroes(int[][] matrix) {
        int Rows=matrix.length;
        int Col=matrix[0].length;
        boolean rowzero=false;
        for(int r=0;r<Rows;r++){
            for(int c=0;c<Col;c++){
                if(matrix[r][c]==0){
                    matrix[0][c]=0;
                    if(r>0){
                        matrix[r][0]=0;
                    }
                    else{
                        rowzero=true;
                    }
                }
            }
        }
        for(int r=1;r<Rows;r++){
            for(int c=1;c<Col;c++){
                if(matrix[0][c]==0||matrix[r][0]==0){
                    matrix[r][c]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int r=0;r<Rows;r++){
                matrix[r][0]=0;
            }
        }
        if(rowzero){
            for(int c=0;c<Col;c++){
                matrix[0][c]=0;
            }
        }
    }
}