class Solution {
    public void rotate(int[][] matrix) {
        int [][]mat = new int[matrix.length][matrix[0].length];
        int c = matrix.length-1,r = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                mat[r++][c] = matrix[i][j];
            }
            r = 0;
            c--;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = mat[i][j];
            }
        }
    }
}
