class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c:word1.toCharArray()){
            freq1[c-'a']++;
        }
        for(char c:word2.toCharArray()){
            freq2[c-'a']++;
        }
        int distinct1 = 0;
        int distinct2 = 0;
        for(int i=0;i<26;i++){
            if(freq1[i]>0) distinct1++;
        }
        for(int i=0;i<26;i++){
            if(freq2[i]>0) distinct2++;
        }
        //if (distinct1 == distinct2) return true;
        for(int a = 0;a<26;a++){
            if(freq1[a]==0) continue;

            for(int b=0;b<26;b++){
                if(freq2[b]==0) continue;
                
                if(a==b){
                    if(distinct1==distinct2) return true;
                }
                else{
                    int nd1 = distinct1;
                    int nd2 = distinct2;
                    if(freq1[a]==1) nd1--;
                    if(freq1[b]==0) nd1++;

                    if(freq2[b]==1) nd2--;
                    if(freq2[a]==0) nd2++;
                    if(nd1==nd2) return true;
                }
                


            }
            
        }
        // check no-op swap (same character sets)
        
        return false;
    }
}