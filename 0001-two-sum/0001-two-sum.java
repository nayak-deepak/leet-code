class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesWithValue = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int searchValue = target - nums[i];
            if(indicesWithValue.containsKey(searchValue)){
                return new int[]{indicesWithValue.get(searchValue), i};
            }
            indicesWithValue.put(nums[i], i);
        }
        return new int[]{-1, -1}; 
    }
}