// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int start=0;
//         int end = letters.length-1;
//         while(start<=end){
//             int mid=start-(start-end)/2;
//             if(target<letters[mid]) end=mid-1;
//             else    start = mid+1;
            
//         }
//         return letters[start%letters.length];
//     }
// }

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(target<letters[i])
            return letters[i];
        }
        return letters[0];
    }
}