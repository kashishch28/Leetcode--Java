// class Solution {
//     public int[] findOriginalArray(int[] changed) {
//         int n = changed.length;
//         if (n % 2 != 0) return new int[0];

//         Map<Integer, Integer> map = new TreeMap<>();
//         for (int x : changed) {
//             map.put(x, map.getOrDefault(x, 0) + 1);
//         }

//         int[] original = new int[n / 2];
//         int idx = 0;

//         for (int x : map.keySet()) {
//             int count = map.get(x);

//             if (count == 0) continue;

//             if (x == 0) {
//                 if (count % 2 != 0) return new int[0];
//                 for (int i = 0; i < count / 2; i++)
//                     original[idx++] = 0;
//             } else {
//                 int doubleVal = x * 2;
//                 if (!map.containsKey(doubleVal) || map.get(doubleVal) < count)
//                     return new int[0];

//                 map.put(doubleVal, map.get(doubleVal) - count);

//                 for (int i = 0; i < count; i++)
//                     original[idx++] = x;
//             }
//         }

//         return original;
//     }
// }


class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        if(n%2==1)return new int[0];
        Arrays.sort(changed);
        int[] count = new int[2*changed[n-1]+1];

        for(int i=0;i<n;i++){
            count[changed[i]]++;
        }
        int[]ans = new int[n/2];
        int i=0;

        if(count[0]%2==1)return new int[0];
        for(int x: changed){
            if(count[x]==0)continue;
            int dx=2*x;
            
            if(dx>=count.length || count[dx]==0) return new int[0];

            ans[i++]=x;
            count[x]--;
            count[dx]--;

            }
            return ans;

    }
}