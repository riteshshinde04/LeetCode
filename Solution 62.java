class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
        if(obs[0][0]==1 ) return 0;
        int n = obs.length;
        int m = obs[0].length;
        int dp[][] = new int[n][m];
        boolean flag = false;
        boolean flag1 = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(i==0 && flag ){
                    dp[i][j]  = -1;
                }
                else if(j==0 && flag1 ){
                    dp[i][j]  = -1;
                }
                else if(obs[i][j]==1){
                    if(i==0)    flag= true;
                    if(j==0)    flag1= true;
                    dp[i][j]  = -1;
                }
                else dp[i][j] = 1;
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(dp[i][j] == -1){
                    continue;
                }
                else if(dp[i][j-1] == -1 && dp[i-1][j] == -1){
                    dp[i][j] = -1;
                    continue;
                }
                else if(dp[i-1][j] == -1){
                    dp[i][j] = dp[i][j-1] ;
                    continue;
                }
                else if(dp[i][j-1] == -1){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                else{
                    dp[i][j] = dp[i][j-1] +  dp[i-1][j];
                }
            }
        }
        return dp[n-1][m-1]==-1?0:dp[n-1][m-1];
    }
}