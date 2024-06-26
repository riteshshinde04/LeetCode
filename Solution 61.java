class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int cnt=1;
        int i=0,j=0;
        while(n>1){
            for(int k=1;k<n;k++){
                ans[i][j] = cnt;
                j++;
                cnt++;
            }
            for(int k=1;k<n;k++){
                ans[i][j] = cnt;
                i++;
                cnt++;
            }
            for(int k=1;k<n;k++){
                ans[i][j] = cnt;
                j--;
                cnt++;
            }
            for(int k=1;k<n;k++){
                ans[i][j] = cnt;
                i--;
                cnt++;
            }
            n=n-2;
            i++;
            j++;
        }
        if(n==1){
            ans[i][j]=cnt;
        }
        return ans;
    }
}