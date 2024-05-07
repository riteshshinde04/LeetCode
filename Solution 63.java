class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid[0].length, dp[][]=new int[2][n], m=grid.length, i, inf=88000;
        for(i=0; i<m; ++i) 
            for(int j=0; j<n; ++j) 
                if(i==0 && j==0) dp[(i)%2][j]=grid[i][j];
                else dp[i&1][j]=grid[i][j]+Math.min(i==0?inf:dp[(i-1)&1][j], 
                                                    j==0?inf:dp[i&1][j-1]);
        return dp[(i-1)&1][n-1];
    }
}