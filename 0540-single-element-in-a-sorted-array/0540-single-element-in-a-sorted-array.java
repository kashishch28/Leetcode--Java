class Solution {
    public int singleNonDuplicate(int[] nums) {
        int b = 0;
        for (int i : nums) {
            b = b ^ i;
        }
        return b;
    }
}