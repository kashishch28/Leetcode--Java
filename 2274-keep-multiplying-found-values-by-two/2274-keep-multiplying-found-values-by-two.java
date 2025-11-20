class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                // original = original*2; //can't do it because next one can be in prev index
                res = original*2;
                return findFinalValue(nums,res);
            }
        }
        return original;
    }
}