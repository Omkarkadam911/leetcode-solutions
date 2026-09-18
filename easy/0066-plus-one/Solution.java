// Problem: #66 - Plus One
// Difficulty: Easy
// Link: https://leetcode.com/problems/plus-one/
// Approach: Check all-nines edge case, then increment last digit with carry propagation

class Solution {
    public int[] plusOne(int[] digits) {

        int last = digits.length - 1;
        boolean allnine = true;

        for (int i = 0; i <= last; i++) {
            if (digits[i] != 9) {
                allnine = false;
            }
        }

        if (allnine) {
            int[] array = new int[last + 2];
            for (int i = 0; i < last + 1; i++) {
                array[i] = 0;
            }
            array[0] = 1;
            return array;
        } else {
            digits[last] += 1;
            for (int i = last; i >= 0; i--) {
                if (digits[i] > 9) {
                    digits[i] = 0;
                    digits[i - 1] += 1;
                }
            }
        }

        return digits;
    }
}
