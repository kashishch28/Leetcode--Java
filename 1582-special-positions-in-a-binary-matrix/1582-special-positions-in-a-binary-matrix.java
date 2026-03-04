class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;//how many horizontal(rows) lines
        int n = mat[0].length;//no of columns in that row

        int[] row = new int[m];//how many 1’s are in row i
        int[] col = new int[n];//how many 1’s are in column j

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //we must check if row and col both have only one 1 and if its the 1 is two times its not special
                if(mat[i][j]==1 && row[i]==1 && col[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}