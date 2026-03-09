class Solution {
    public int subarraySum(int[] nums, int k) {
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             c++;
        //         }
        //     }
        // }
        // return c;

         Map<Integer, Integer> mp = new HashMap<>();// sum,count;
        int ans = 0;
        int sum = 0;
        mp.put(0, 1);

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            if (mp.containsKey(sum - k)) {
                ans += mp.get(sum - k);
            }

            if (!mp.containsKey(sum)) {
                mp.put(sum, 1);
            } else {
                mp.put(sum, mp.get(sum) + 1);
            }
        }
        return ans;
    }
}