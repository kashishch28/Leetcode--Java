class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String s:operations){
            if(s.contains("-")){
                count-=1;
            }
            else{
                count+=1;
            }
        }
        return count;
    }
}