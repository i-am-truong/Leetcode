class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, result = 0;
        for (int n : nums){
            result = Math.max(result, count = n == 0 ? 0 : count+1);
        }
        return result;
    }
}