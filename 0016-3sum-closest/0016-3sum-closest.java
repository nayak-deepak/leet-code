class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int nearest = 123456;

        for (int i = 0; i < nums.length - 2; i++) {
            int base = i;
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[base] + nums[left] + nums[right];
                if (sum == target) {
                    return target;
                }
                if(Math.abs(target - sum) < Math.abs(target - nearest)){
                    nearest = sum;
                }
                if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return nearest;

    }
}