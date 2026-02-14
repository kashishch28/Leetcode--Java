class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer>map = new HashMap<>();
        for(String w:words){
            if(w.length()>=k){
                String pref = w.substring(0,k);
                map.put(pref,map.getOrDefault(pref,0)+1);
            }
        }
        int g=0;
        for(int i:map.values()){
            if(i>=2){
                g++;
            }
        }
        return g;
            
    }
}