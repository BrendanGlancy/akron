#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
      vector<vector<int>> ans;
      vector<int> current;
      sort(candidates.begin(), candidates.end());
      dfs(candidates, target, 0, current, ans);
      return ans;
    }

    void dfs(vector<int>& candidates, int target, int index, vector<int>& current, vector<vector<int>>& ans) {
      if (target == 0) {
        ans.push_back(current);
        return;
      }
      if (target < 0) {
        return;
      }
      for (int i = index; i < candidates.size(); i++) {
        if (i > index && candidates[i] == candidates[i - 1]) continue;
        current.push_back(candidates[i]);
        dfs(candidates, target - candidates[i], i + 1, current, ans);
        current.pop_back();
      }
    }
};
