class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }

        int min = freq['b' - 'a'];
        min = Math.min(min, freq['a' - 'a']);
        min = Math.min(min, freq['l' - 'a'] / 2);
        min = Math.min(min, freq['o' - 'a'] / 2);
        min = Math.min(min, freq['n' - 'a']);

        return min;
    }
}