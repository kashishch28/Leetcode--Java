class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            empty = empty-numExchange;
            res+=1;
            empty+=1;
            numExchange+=1;
            
        }
        return res;
    }
}