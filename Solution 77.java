class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m][n];
        for (int row[] : dp)    Arrays.fill(row, -1);
        return util(word1, m - 1, word2, n - 1, dp);
    }
    public int util(String word1, int i, String word2, int j, int dp[][]) {
        if (j < 0)    return i + 1;
        if (i < 0)    return j + 1;
        if (dp[i][j] != -1)    return dp[i][j];
        if (word1.charAt(i) == word2.charAt(j))    return dp[i][j] = util(word1, i - 1, word2, j - 1, dp);
        int insert = 1 + util(word1, i, word2, j - 1, dp), delete = 1 + util(word1, i - 1, word2, j, dp), replace = 1 + util(word1, i - 1, word2, j - 1, dp);
        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }
}