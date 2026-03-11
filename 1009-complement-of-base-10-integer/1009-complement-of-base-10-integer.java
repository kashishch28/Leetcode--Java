class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder ans = new StringBuilder();
        for(char c:bin.toCharArray()){
            if(c=='0'){
                ans.append("1");
            }
            else{
                ans.append("0");
            }
        }
        return Integer.parseInt(ans.toString(),2);
    }
}