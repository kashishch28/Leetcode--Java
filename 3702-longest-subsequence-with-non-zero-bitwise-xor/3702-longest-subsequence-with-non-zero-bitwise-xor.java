class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0;
        for(int i:nums){
            x^=i;
        }
        if(x!=0)return nums.length;
        for(int i:nums){
            if(i!=0)return nums.length-1;

        }
        return x;
    }
}