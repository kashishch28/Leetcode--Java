class Solution {
    public int reverseBits(int n) {
        Integer m = n;
        String s = Integer.toBinaryString(n);
        while(s.length()<32){
            s = "0"+s;
        }
        String rev = new StringBuilder(s).reverse().toString();
        return (int)Long.parseLong(rev,2);

    }
}