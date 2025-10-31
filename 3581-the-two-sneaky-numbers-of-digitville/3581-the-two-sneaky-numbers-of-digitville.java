class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>al = new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==2){
                al.add(num);
            }
        }
        int[] ans = new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i] = al.get(i);
        }
        return ans;

    }
}