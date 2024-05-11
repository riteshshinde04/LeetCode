class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = rows*cols;

        int low =0; int high = l-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int num = getValue(matrix, cols, mid);
            if(num==target) return true;
            else if(num<target) low = mid+1;
            else high = mid-1;
        }
        return false;

    }

    public int getValue(int[][] matrix, int cols, int index) {
        int r = index/cols;
        int c = index%cols;
        return matrix[r][c];
    }
}