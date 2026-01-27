class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        // long min=0;
        Set<Integer>set = new HashSet<>();
        long sum=0;
        for(int i:nums){
            if(!set.contains(i) && i<=k){
                k++;
                sum+=i;
            }
            set.add(i);
        }
        long ans = (long)(1+k)*k/2-sum;
        return ans;
    }
}