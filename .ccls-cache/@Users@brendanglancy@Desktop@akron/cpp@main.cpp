class Solution {
  // given a non-empty array of integers nums
  // every element appears twice except for one
  // find that single one
  // return the non-duplicated one
  // implement a solution that with a linear runtime complexity
  // use only constant extra space
public:
  int singleNumber(vector<int> &nums) {
    // use a hash table to store the number of times each number appears
    // if the number appears once, then it is the single number
    // if the number appears twice, then it is not the single number
    unordered_map<int, int> num_count;
    for (int num : nums) {
      num_count[num]++;
    }
    for (auto it = num_count.begin(); it != num_count.end(); it++) {
      if (it->second == 1) {
        return it->first;
      }
    }
    return -1;
  }
};
