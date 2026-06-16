class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int next = 1;
        int distinct = 1;

        while(next < nums.length){
            if(nums[next] == nums[start]){
                next++;
            }else{
                start++;
                nums[start] = nums[next];
                next++;
                distinct++;
            }
        }

        return distinct;
    }
}