class Solution {
    public int maxOperations(String s) {
        int one = 0;
        int op = 0;
        HashSet<Integer> set = new HashSet<>();
        for(char ch: s.toCharArray()){
            if(ch == '1'){
                one++;
            }else{
                if(!set.contains(one)){
                    op += one;
                }
                set.add(one);
            }
        }

        return op;
    }
}