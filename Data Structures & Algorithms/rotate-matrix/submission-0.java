class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length-1;
        int n=matrix[0].length;
        int[][] ans = new int[n][n];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=m;j++){
                ans[j][m-i]=matrix[i][j];
            }
        }
        for(int i=0;i<=m;i++){
            for(int j=0;j<=m;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}
