// Problem 2413: Smallest Even Multiple

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else{
            return 2*n;
        }
    }
}