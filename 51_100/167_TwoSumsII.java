// Problem 167: Two Sums II

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){

            return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else{right--;}
        }
        return new int[]{-1,-1};
    }
}

// Instead od creating a new array and return values we can create a new array beforehand also
// int[] result = new int[2];   // create array first

// result[0] = left + 1;
// result[1] = right + 1;

// return result;