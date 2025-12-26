class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>al = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n+1];
        int mis=-1;
        for(int i:nums){
            if(i<=n){
                freq[i]++;
            }
            
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                mis=i;
                al.add(i);
            }
               
        }
        return al;
    }
}