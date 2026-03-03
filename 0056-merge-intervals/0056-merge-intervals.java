class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        int[] prev = intervals[0];
        List<int[]>ls = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int[] cur = intervals[i];
            if(cur[0]<=prev[1]){
                prev[1] = Math.max(prev[1],cur[1]);
            }
            else{
                ls.add(prev);
                prev = cur;
            }
        }
        ls.add(prev);
        return ls.toArray(new int[ls.size()][]);

    }
}