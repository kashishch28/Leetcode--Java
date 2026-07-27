class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int prov = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                prov++;
            }
        }
        return prov;
    }
    public void dfs(int node,int[][] nums,boolean[] vis){
        vis[node] = true;
        for(int i=0;i<nums.length;i++){
            if(!vis[i]&& nums[node][i]==1){
                dfs(i,nums,vis);
            }
        }
    }
}