class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;  
        int totalSum = 0;  

        // Calculate the total sum of the array  
        for (int num : nums) {  
            totalSum += num;  
        }  

        int leftSum = 0;  
        int count = 0;  

        // Iterate through possible partition indices  
        for (int i = 0; i < n - 1; i++) {  
            leftSum += nums[i];  
            int rightSum = totalSum - leftSum;  

            // Check if the difference is even  
            if ((leftSum - rightSum) % 2 == 0) {  
                count++;  
            }  
        }  

        return count;  
    }  

    }
