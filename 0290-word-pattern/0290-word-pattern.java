class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length()!=str.length)return false;
        HashMap<Character,String> CharToWord = new HashMap<>();
        HashMap<String,Character> WordToChar = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = str[i];

            if(CharToWord.containsKey(ch)){
                if(!CharToWord.get(ch).equals(word))return false;
            }
            else{
                CharToWord.put(ch,word);
            }

            if(WordToChar.containsKey(word)){
                if(WordToChar.get(word)!=ch)return false;
            }
            else{
                WordToChar.put(word,ch);
            }
        }
        return true;


    }
}
