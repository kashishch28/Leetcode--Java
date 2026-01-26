class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            int diff = Math.abs(arr[i]-arr[i+1]);
            if(diff<min){
                min  = diff;
                ls.clear();
                ls.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if(diff==min){
                ls.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return ls;
    }
}