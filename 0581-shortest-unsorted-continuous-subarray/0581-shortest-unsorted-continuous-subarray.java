class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start=-1;
        int end =-1;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]<max){
                end = i;
                // max = nums[i];
            }
            else{
                max = nums[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>min){
                start = i;
                // min = nums[i];
            }
            else{
                min = nums[i];
            }
        }
        if(end==-1)return 0;
        return end-start+1;
    }
}