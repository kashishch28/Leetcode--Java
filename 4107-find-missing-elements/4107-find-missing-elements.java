class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        List<Integer>ls = new ArrayList<>();
        Set<Integer>set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}