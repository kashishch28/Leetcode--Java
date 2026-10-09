class Solution {
    public int trailingZeroes(int n) {
        int count2 = 0;
        int count5 = 0;
        for (int i = 2; i <= n; i++) { 
            int num = i;
            while (num % 2 == 0) {
                count2++;
                num /= 2;
            }
            // Reset
            num = i;

            while (num % 5 == 0) {
                count5++;
                num /= 5;
            }
        }

        return Math.min(count2, count5);
    }
}
