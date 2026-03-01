class Solution {
    //Note for short trick: return the largest digit of number 
    //32:11+11+10      ;   43: 11+11+11+10
    public int minPartitions(String n) {
        int maxx=0;
        for(char c:n.toCharArray()){
            int d = c-'0';
            if(d>maxx){
                maxx = d;
            }

        }
        return maxx;
    }
}