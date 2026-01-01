class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i =digits.length-1;i>=0;i--){
            if(digits[i]<9){ //rightmost digit is not 9 for carry
                ++digits[i];//plus 1 and return
                return digits;
            }
            digits[i]=0;//rightmost is 9 plus one and last one became 0 and loop runs 
        }
            int [] ans = new int[digits.length+1];//all digits are 9 increase array length
            ans[0] = 1; //add 1 in index 0 and all rest automatically chaged to 0
            return ans;

        
    }
}
