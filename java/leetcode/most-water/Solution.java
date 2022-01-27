class Solution {
    // given an integer array height of length n
    // n vertical lines are drawn such that the two endpoints of line i is (i, height[i]) and (i, 0).
    // find the maximum area of a rectangle formed from these lines.
    // Input: [1,8,6,2,5,4,8,3,7]
    // Output: 49
    // Note you may not slant the container
    // Time: O(n^2)
    // Space: O(1)
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = length - 1;
        int ans = Integer.MIN_VALUE;
        while(i<j) {
            int area = Math.min(height[i], height[j]) * (j-i);
            ans = Math.max(ans, area);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
