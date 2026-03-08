class Solution {
    public int lengthOfLastWord(String s) {
        String c = s.strip();
        int count=0;
        int n=c.length()-1;
        for(int i=n;i>=0;i--){
            if(c.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}