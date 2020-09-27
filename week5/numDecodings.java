class Solution {
    public int numDecodings(String s) {
        char[] c = s.toCharArray();

        if (c[0] == '0') return 0;
        int pre = 1, curr = 1;
        for (int i = 1; i < c.length; i++) {
            int tmp = curr;
            if (c[i] == '0'){
                if (c[i - 1] == '1' || c[i - 1] == '2') curr = pre;
                else return 0;
            }
            else if (c[i - 1] == '1' || (c[i - 1] == '2' && c[i] >= '1' && c[i] <= '6')){
                curr = curr + pre;
            }
            pre = tmp;
        }
        return curr;


    }
}