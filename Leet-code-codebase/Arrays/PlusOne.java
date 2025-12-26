class PlusOne {
    public int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;      // simple increment
                return digits;    // done
            }

            // digit is 9 → becomes 0, carry forward
            digits[i] = 0;
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;   // e.g., 999 + 1 = 1000

        return result;
    }
}
