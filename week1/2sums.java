class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int[] index = {0,0};
        int i = 0 ;
        int j = sortedNums.length - 1 ;
        int p = 0;
        int q = 0;

        while ( i < j ){
            if ( sortedNums[i] + sortedNums[j] == target ){
                p =  sortedNums[i];
                q =  sortedNums[j];
                break;
            }
           if ( sortedNums[i] + sortedNums[j] > target){
                j--;
            }
            if ( sortedNums[i] + sortedNums[j] < target){
                i++;
            }
        }

        //System.out.println("p = "+p+", q = "+q);

        for ( i = 0, j = 0 ; i < nums.length && j < 2; i++){
            System.out.println("nums["+i+"] is "+ nums[i]);
            if( nums[i] == p || nums[i] == q){
                index[j] = i;
                j++;                
            }
        }
         
        return index;
    }
}