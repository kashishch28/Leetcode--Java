class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        // Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int last = intervals[0][1]; //take first interval's end value
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<last){
                count++;//overlap->remove
            }
            else{
                last = intervals[i][1];
            }
        }
        return count;
    }
}
