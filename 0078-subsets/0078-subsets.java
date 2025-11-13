class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        back(0,nums,new ArrayList<>(),result);
        return result;    
    }
    private void back(int ind,int[] nums,List<Integer>temp,List<List<Integer>>ans){
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            temp.add(nums[i]);
            back(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}



// List<List<Integer>> result = new ArrayList<>();
        // int n=nums.length;
        // int subset = 1<<n;
        // for(int i=0;i<subset;i++){
        //     List<Integer> sub = new ArrayList<>();
        //     for(int j=0;j<n;j++){
        //         if((i & (1<<j))!=0){
        //           sub.add(nums[j]);  
        //         }
        //     }
        //     result.add(sub);
        // }
        // return result;