import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = i;
                return result; 
            }
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array or handle it as needed
        return new int[0]; // or throw an exception
    }
}