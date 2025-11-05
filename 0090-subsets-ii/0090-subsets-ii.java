class Solution {
    // public List<List<Integer>> subsetsWithDup(int[] nums) {
    //     Arrays.sort(nums);

    //     // to avoid duplicates
    //     Set<List<Integer>> resultSet = new HashSet<>();
    //     resultSet.add(new ArrayList<>());

    //     for (int num : nums) {
    //         Set<List<Integer>> newSubsets = new HashSet<>();
    //         for (List<Integer> subset : resultSet) {
    //             List<Integer> newSub = new ArrayList<>(subset);
    //             newSub.add(num);
    //             newSubsets.add(newSub);
    //         }
    //         resultSet.addAll(newSubsets);
    //     }

    //     // Convert the set back to a list
    //     return new ArrayList<>(resultSet);





    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums); // Sorting helps avoid duplicates
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, List<Integer> tempSet, int[] nums, int start) {
        resultList.add(new ArrayList<>(tempSet));

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            tempSet.add(nums[i]);
            backtrack(resultList, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    
    }
}
