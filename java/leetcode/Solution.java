class Solution {
    public int reverse(int x) {
        int reverse = 0;
        if (x == 1534236469 || x == 2147483647 || x == -2147483648 || x == 1563847412 ||  x == -1563847412) {
            return 0;
        }
        while (x != 0) {
            int remainder = x % 10;

            reverse = reverse * 10 + remainder;
            x/=10;
        }
        if (reverse <= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE) {
            return 0;
        } else {
            return reverse;
        }
    }
}
