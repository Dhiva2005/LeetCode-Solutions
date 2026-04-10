// Problem 231: Power Of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1)) == 0;
    }
}


/**
 * Logic
 * 
 * Every 2 power n number contain only one one in it
 * 
 * So if we do and operation of and its (n-1) we get 0
 */