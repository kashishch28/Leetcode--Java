class Solution {
    public String reverseByType(String s) {
        List<Character>al = new ArrayList<>();
        List<Character>sp = new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch>='a'&& ch<='z'){
                al.add(ch);
            }
            else{
                sp.add(ch);
            }
        }
        Collections.reverse(al);
        Collections.reverse(sp);

        StringBuilder sb = new StringBuilder();
        int l=0;
        int spp=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sb.append(al.get(l++));
                
            }
            else{
                sb.append(sp.get(spp++));
            }
        }
        return sb.toString();
    }
}