// Problem 69: Sqrt(X)

class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sqrt = (long)mid * mid;

            // USING LONG DUE TO SQRT
            // IF X = 5000
            // THEN IT BECAME SQRT = 25000000

            if (sqrt == x)
                return mid;
            else if (sqrt < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}