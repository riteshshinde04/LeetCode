class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] sindex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sindex[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < t.length(); i++) {
            sindex[t.charAt(i) - 'a'] = i - sindex[t.charAt(i) - 'a'];
        }
        int sum = 0;
        for (int num : sindex) {
            sum += Math.abs(num);
        }
        return sum;
    }
}