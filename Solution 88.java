class Solution {
    public static int scoreOfString(String s) {
        int score = 0;
        if (s == null || s.length() <= 1) {
            return score;
        }

        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }
}