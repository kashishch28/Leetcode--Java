class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            res.append(nums[i].charAt(i) == '1' ? '0' : '1');
        }
        return res.toString();
    }
}