// Problem 202: Happy Number

import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();

        while (n != 1 && !s.contains(n)) {
            s.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit;
            num = num / 10;
        }
        return sum;
    }
}