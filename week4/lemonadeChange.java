class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        

        for ( int bill : bills){
            switch (bill){
                case 5: five++;break;
                case 10: five--; ten++;break;
                case 20:
                    if(ten>0){
                        five--;
                        ten--;
                    }
                    else{
                        five -= 3;
                    }
                    break;
                default: break;
            }
         if(five<0) return false;   
        }
        
        return true;
    }

}