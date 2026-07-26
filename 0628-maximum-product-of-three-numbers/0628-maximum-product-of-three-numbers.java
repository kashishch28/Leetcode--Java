class Solution {
    public int maximumProduct(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int prod= Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1]));
        //n-1->if there are four ele ten the last one is greater so use use n-1 in last instead od nums[2]
        return prod;
    }
}