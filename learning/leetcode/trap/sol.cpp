#include <algorithm>
#include <vector>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
      if(height.empty()) return 0; // Edge case
      int n = height.size();
      
      vector<int> leftmax(n);
      leftmax[0] = height[0];
      for (int i = 1; i < height.size(); i++) {
        leftmax[i] = max(leftmax[i-1], height[i]);
      }
      
      vector<int> rightmax(n);
      rightmax[n -1] = height[n-1];

      for (int i = n-2; i >= 0; i--) {
        rightmax[i] = max(rightmax[i+1], height[i]);
      }

      int trapped = 0;
      for (int i = 0; i < n; i++) {
        trapped += min(leftmax[i], rightmax[i]) - height[i];
      }

      return trapped;
    }
};
