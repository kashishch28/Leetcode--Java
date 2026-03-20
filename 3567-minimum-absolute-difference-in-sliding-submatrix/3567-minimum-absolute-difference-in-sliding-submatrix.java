class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                List<Integer>res = new ArrayList<>();
                //extract submatix
                for(int x=i;x<i+k;x++){
                    for(int y=j;y<j+k;y++){
                        res.add(grid[x][y]);
                    }
                }
                Collections.sort(res);
                int minl = Integer.MAX_VALUE;
                for(int a=1;a<res.size();a++){
                    if(!res.get(a).equals(res.get(a-1))){
                        minl = Math.min(minl,Math.abs(res.get(a)-res.get(a-1)));
                    }
                }
                ans[i][j] = (minl==Integer.MAX_VALUE)?0:minl;
            }
        }
        return ans;
    }
}