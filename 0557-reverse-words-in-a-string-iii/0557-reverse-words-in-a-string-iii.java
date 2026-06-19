class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String ch:word){
            for(int i=ch.length()-1;i>=0;i--){
                sb.append(ch.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}