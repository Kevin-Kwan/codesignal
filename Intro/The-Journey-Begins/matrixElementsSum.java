int solution(int[][] matrix) {
    int total = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j=0; j< matrix[0].length;j++) {
            if (matrix[i][j]==0 && i!=matrix.length-1) {
                matrix[i+1][j]=0;
            }
            if (matrix[i][j]!=0) {
                total+=matrix[i][j];
            }
        }
    }
    return total;
}
