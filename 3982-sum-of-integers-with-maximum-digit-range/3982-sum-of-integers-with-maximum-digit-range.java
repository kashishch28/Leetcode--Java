class Solution {
    public int maxDigitRange(int[] nums) {
        int ans=-1;
        int sum=0;
        for(int num:nums){
            int range = Range(num);
            if(range>ans){
                ans = range;
                sum=num;
            }
            else if(ans==range){
                sum+=num;
            }
        }
        return sum;
    }
    private int Range(int n){
        int min = 9;
        int max = 0;
        while(n>0){
            int digit = n%10;
            min = Math.min(min,digit);
            max = Math.max(max,digit);
            n/=10;
        }
        return max-min;
    }
}