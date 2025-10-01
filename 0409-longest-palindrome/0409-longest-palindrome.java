class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int n=0;
        boolean odd=false;
        for(int count:map.values()){
            if(count%2==0){
                n+=count;
            }
            else{
                n+=count-1;
                odd=true;
            }
        }
        if(odd){
            n+=1;
        }
        return n;
    }
}