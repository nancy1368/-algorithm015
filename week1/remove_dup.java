class Solution {
    public int removeDuplicates(int[] nums) {
        int j, k = 0;        
        
        for ( int i = 0 ; i < nums.length ; i++){
            for ( j = i + 1 ; j < nums.length ; j++){
                if (nums[i] == nums[j]){
                    continue;  
                }
                else {
                    k++;
                    nums[k] = nums[j];
                    i = j - 1;
                    break;
                }                
            }
        }

        k = k + 1;

        //System.out.println(k);
        return k;
    }