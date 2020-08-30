//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int r = 1;

        for ( i = 1; i <= n; i++ ){
            p = q;
            q = r;
            r = p + q;

        }
        return r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)