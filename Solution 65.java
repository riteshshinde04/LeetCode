class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] isOriginalZero = new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0)
                    isOriginalZero[i][j] = true;
                else
                    continue;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int currRow = i;
                int currCol = j;
                if(matrix[currRow][currCol]==0 && isOriginalZero[currRow][currCol]){
                    for(int c=0;c<currCol;c++){
                        matrix[currRow][c] = 0;
                    }
                    for(int c=currCol;c<cols;c++){
                        matrix[currRow][c] = 0;
                    }

                    for(int r=0;r<currRow;r++){
                        matrix[r][currCol] = 0;
                    }
                    for(int r=currRow;r<rows;r++){
                        matrix[r][currCol] = 0;
                    }
                }

                else
                    continue;
            }
        }
    }
}
