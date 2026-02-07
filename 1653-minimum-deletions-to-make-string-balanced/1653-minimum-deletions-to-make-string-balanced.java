class Solution {
    public int minimumDeletions(String s) {
        int dp = 0;
        int countB = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                dp = Math.min(dp + 1, countB);
            } else {
                countB++;
            }
        }

        return dp;
    }
}