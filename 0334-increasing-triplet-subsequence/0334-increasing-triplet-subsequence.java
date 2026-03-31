class Solution {
    public boolean increasingTriplet(int[] nums) {
            //will give TLE (O(n^3))

        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]<nums[j] && nums[j]<nums[k]){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=first){
                first = i;
            }
            else if(i<=second){
                second = i;
            }
            else{
                // found number > second > first
                return true;
            }
        }
        return false;
    }
}