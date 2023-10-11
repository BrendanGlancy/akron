#include <vector>
using namespace std;

class Solution {
public:
    void solveSudoku(vector<vector<char>>& board) {
        
    }

    bool isValidSudoku(vector<vector<char>>& board) {
      bool row[9][9] = {false};
      bool col[9][9] = {false};
      bool box[9][9] = {false};
      for (int i = 0; i <= 8; i++) {
        for (int j = 0; j <= 8; j++) {
          if (board[i][j] == '.') continue;
          int num = board[i][j] - '1';
          int k = i / 3 * 3 + j / 3;
          if (row[i][num] || col[j][num] || box[k][num]) return false;
          row[i][num] = col[j][num] = box[k][num] = true;
        }
      }
      
      return true;
    }
};
