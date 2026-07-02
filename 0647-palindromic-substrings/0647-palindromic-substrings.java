class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sb = s.substring(i,j+1);
                if(pal(sb))count++;
            }

        }
        return count;

    }
    public boolean pal(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

