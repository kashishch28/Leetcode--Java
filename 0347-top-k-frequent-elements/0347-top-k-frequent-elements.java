class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer, Integer> fre = new HashMap<>();
        // for (int num : nums) {
        //     fre.put(num, fre.getOrDefault(num, 0) + 1);
        // }
        // List<Integer> uniq = new ArrayList<>(fre.keySet());
        // uniq.sort((a, b) -> fre.get(b) - fre.get(a));
        // int[] res = new int[k];
        // for (int i = 0; i < k; i++) {
        //     res[i] = uniq.get(i); 
        // }
        // return res; 

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i:map.keySet()){
            pq.offer(new int[]{i,map.get(i)});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll()[0];
        }
        return ans;

    }
}
