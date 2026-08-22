class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1;
        int rem=0;
        int original=n;
        while(n>0){
            
            int digit = n%10;
            rem+=digit;
            prod*=digit;
            n/=10;
        }
        int sum = rem+prod;
        if(original%sum==0)return true;
        return false;

    }
}