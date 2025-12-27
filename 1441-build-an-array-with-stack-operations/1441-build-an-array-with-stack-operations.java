class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int j=0;
        for(int i=1;i<=n&& j<target.length;i++){
            ops.add("Push");
            if(i==target[j]){
                j++;
            }
            else{
                ops.add("Pop");
            }
        }
        return ops;
    }
}