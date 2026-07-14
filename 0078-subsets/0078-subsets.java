class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        back(0,nums,new ArrayList<>(),result);
        return result;    
    }
    private void back(int ind,int[] nums,List<Integer>temp,List<List<Integer>>ans){
        if(nums.length==ind){
            ans.add(new ArrayList<>(temp));
            return; 
        }
        // for(int i=ind;i<nums.length;i++){
        //     temp.add(nums[i]);
        //     back(i+1,nums,temp,ans);
        //     temp.remove(temp.size()-1);
        // }
        temp.add(nums[ind]);
        back(ind+1,nums,temp,ans);
 
        temp.remove(temp.size()-1);
        back(ind+1,nums,temp,ans);
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