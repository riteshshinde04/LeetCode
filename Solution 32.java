class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb = new ArrayList();
        generateCombination(0, candidates, new ArrayList(), comb, target);
        return comb;
    }

    void generateCombination(int start, int[] nums, List<Integer> current, List<List<Integer>> comb, int target) {
        if (target == 0) {
            comb.add(new ArrayList(current));
            return; // Exit the function to avoid duplicate addition
        }

        if (target < 0 || start >= nums.length) {
            return;
        }

        // Exclude current number
        generateCombination(start + 1, nums, current, comb, target);

        // Include current number
        current.add(nums[start]);
        generateCombination(start, nums, current, comb, target - nums[start]);
        current.remove(current.size() - 1);
    }
}