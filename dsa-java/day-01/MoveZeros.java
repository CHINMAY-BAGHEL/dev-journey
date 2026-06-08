class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        
        // First pass — move all non-zeros to front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;              
            }
        }

        // Second pass — fill remaining positions with 0
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}