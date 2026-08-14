class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int max=0;
        int left=0;
        for(int r=0 ; r<s.length() ; r++){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char leftChar = s.charAt(left);
                //map.put(leftChar,map.getOrDefault(leftChar,0)-1);
                map.put(leftChar,map.get(leftChar) - 1);

                left++;
            }
            max = Math.max(r-left+1,max);
        }
        return max;
    }
}