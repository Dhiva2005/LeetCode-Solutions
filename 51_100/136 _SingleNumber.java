// Problem 136: Single NUmber

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num: nums){
            res^=num;
        }
        return res;
    }
}