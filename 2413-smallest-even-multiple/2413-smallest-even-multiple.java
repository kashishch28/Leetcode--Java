class Solution {
    public int smallestEvenMultiple(int n) {
        return (n%2==0)?n:n*2;
    }
}

/*
Even → already divisible by 2 → answer = n
Odd → need to add factor 2 → answer = 2n
*/