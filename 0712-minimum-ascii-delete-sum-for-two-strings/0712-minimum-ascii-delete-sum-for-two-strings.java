class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int total=0;
        int a = s1.length();
        int b = s2.length();

        for(int i=0;i<a;i++){
            total+=s1.charAt(i);   //calculating total ascii of string
        }
        for(int i=0;i<b;i++){
            total+=s2.charAt(i);
        }

        int[][] dp = new int [a+1][b+1];
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    int asc = (int)s1.charAt(i-1);
                    dp[i][j] = dp[i-1][j-1]+asc;

                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return total-2*dp[a][b];
    }
}