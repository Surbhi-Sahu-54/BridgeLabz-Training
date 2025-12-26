class Zeroes{
    public void moveZeroes(int[] nums) {

        int k = 0; // position for next non-zero element

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Step 2: Fill remaining positions with zero
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
