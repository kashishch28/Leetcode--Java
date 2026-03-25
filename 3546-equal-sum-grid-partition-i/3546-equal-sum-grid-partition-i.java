class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        long[] row = new long[grid.length];
        long[] col = new long[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
                row[i]+= grid[i][j];
                col[j]+= grid[i][j];
            }
        }
        if(sum%2!=0)return false;
        //horizontal check
        long upper=0;
        for(int i=0;i<grid.length-1;i++){ 
            upper+=row[i];
            if(upper==sum-upper){
                return true;
            }
            
        }
        //vertical check
        long left=0;
        for(int j=0;j<grid[0].length-1;j++){
            left+=col[j];
            if(left==sum-left){
                return true;
            }
        }
        return false;
    }
}
/*

sum should be divisible by 2 for eligible to divide
*/ 