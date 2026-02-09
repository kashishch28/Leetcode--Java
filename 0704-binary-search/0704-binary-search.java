class Solution {
    public int search(int[] nums, int target) {
        //Recursion
//         return binarySearch(nums,target,0,nums.length-1);
//     }
//         public static int binarySearch(int[] nums,int target,int start,int end){
//             if (start > end) {
//             return -1;
//         }
//         int mid = start + (end - start) / 2;
//         if (nums[mid] == target) {
//             return mid;
//         } else if (nums[mid] > target) {
//             return binarySearch(nums, target, start, mid - 1);
//         } else {
//             return binarySearch(nums, target, mid + 1, end);
//         }
//     }
// }   

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }


        }
        return -1;
   }
   
}