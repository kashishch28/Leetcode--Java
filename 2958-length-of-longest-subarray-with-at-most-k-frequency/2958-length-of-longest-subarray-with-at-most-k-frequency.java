class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        int left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.get(nums[right])>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;


        //TLE
        // for(int i=0;i<nums.length;i++){
        //     HashMap<Integer,Integer>map = new HashMap<>();
        //     for(int j=i;j<nums.length;j++){
        //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);

        //         if(map.get(nums[j])>k){
        //             break;
        //         }
        //         max = Math.max(j-i+1,max);
        //     }
           
        // }

        // return max;
    }
}