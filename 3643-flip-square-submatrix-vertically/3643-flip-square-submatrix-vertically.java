class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int top=x;
        int bot=x+k-1;
        while(top<bot){
            for(int j=y;j<y+k;j++){
                int temp = grid[top][j];
                grid[top][j] = grid[bot][j];
                grid[bot][j] = temp;
            }
            top++;
            bot--;
        }
        return grid;
    }
}