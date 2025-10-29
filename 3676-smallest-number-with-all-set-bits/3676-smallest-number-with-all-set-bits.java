class Solution {
    public int smallestNumber(int n) {
        int k=1;
        int num = (1<<k)-1; // 2^k - 1 using bit shift
        while(num<n){
            k++;
            num = (1<<k)-1;
        }
        return num;

    }
}