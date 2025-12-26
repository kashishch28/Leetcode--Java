class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        int mis=-1;
        int dup=-1;
        for(int i:nums){
            freq[i]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==0)mis=i;
            if(freq[i]==2)dup=i;
        }
        return new int[]{dup,mis};
    }
}