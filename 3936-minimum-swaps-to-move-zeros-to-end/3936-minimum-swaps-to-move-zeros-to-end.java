class Solution {
    public int minimumSwaps(int[] nums) {
        //count zeroes
        int zero=0;
        for(int i:nums){
            if(i==0){
                zero++;
            }
        }
        int op=0;
        for(int i=0;i<nums.length-zero;i++){
            if(nums[i]==0)op++;
        }
        return op;
    }
}