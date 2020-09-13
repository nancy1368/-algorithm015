class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new LinkedList<>();
        backtrack(list, n, k, 1, new ArrayList<>());
        return list;
   }
    private void backtrack(List<List<Integer>> list, int n, int k, int start, List<Integer> tempList) {
        //terminator
        if (k == 0) {
            list.add(new LinkedList<>(tempList));
            return;
        }
        
        for (int i = start; i <= n - k + 1; i++) {
            //process current logic
            tempList.add(i);
            //drill down
            backtrack(list, n, k - 1, i + 1, tempList);
            //revert state
            tempList.remove(tempList.size() - 1);
        }
    }

}