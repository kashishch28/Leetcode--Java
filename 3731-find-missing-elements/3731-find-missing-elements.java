class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // int actual=0;
        // int n = nums.length;
        // int sum=0;
        // int exp = n*(n+1)/2;
        // for(int i:nums){
        //     actual+=i;
        // }
        // return exp-actual;

    // -> This approch would work if it is asking for one missing number as it is asking for list of element which means one or more then we use list and hashset approach

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer>ls = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums){
            min = Math.min(i,min);
            max = Math.max(i,max);
            set.add(i);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;


    }
}