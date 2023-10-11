#include <vector>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
      int trapped;
      vector<int> locs;
      int peak = 0;
      int temp;

      for (int i = 0; i < height.size(); i++) {
        if (height[i] > peak) {
          peak = height[i];
          temp = i;
        }
      }

      return trapped;
    }
};
