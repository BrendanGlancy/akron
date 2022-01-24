
class Solution {
public int climbStairs(int n) {
if(n<=3)return n;
int j = 2;
int k = 3;
for(int i = 4;i <= n;i++){
if(i % 2 == 0)j = j+k;
else k = k+j;
}
if(n % 2 == 0)return j;
else return k;

}
}

