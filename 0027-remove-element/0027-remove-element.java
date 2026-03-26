// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int j=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=val){
//                 nums[j] = nums[i];
//                 j++;
//             }
//         }
//         return j;
//     }

// }

class Solution{
    public int removeElement(int[] nums, int val){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                int temp=nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}