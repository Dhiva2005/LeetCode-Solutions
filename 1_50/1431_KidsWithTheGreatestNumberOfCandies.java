// Problem 1431: Kids With the Greatest Number of Candies

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) max = candies[i];
        }

        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + ec >= max) res.add(true);
            else res.add(false);
        }

        return res;
    }
}