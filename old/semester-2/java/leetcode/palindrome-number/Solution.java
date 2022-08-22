class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int y = x;
        while (x != 0) {

            // get last digit from x
            int digit = x % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from x
            x /= 10;
        }

        if (reversed == y) {
            return true;
        } else {
            return false;
        }
    }
}
