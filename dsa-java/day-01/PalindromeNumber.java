// LC #9 - Palindrome Number
// Approach: Full integer reversal with negative guard
// Time Complexity: O(log n) — digits in number
// Space Complexity: O(1)
// Date: 06/06/2026

class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindromes
        // Numbers ending in 0 (except 0 itself) are never palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int remainder;
        int sum = 0;
        int copied = x;

        while (x > 0) {
            remainder = x % 10;
            sum = sum * 10 + remainder;
            x = x / 10;
        }

        return copied == sum;
    }
}