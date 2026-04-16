class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int res=Integer.MAX_VALUE;
        int n = words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int straightDistance = Math.abs(i-startIndex);
                int circularD = n-straightDistance;
                res = Math.min(res , Math.min(straightDistance, circularD));

            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}


