class Solution {
    public int findNumbers(int[] nums) {
        int numbers = 0;
                for(int i : nums){
            if(((int)Math.log10(i)&1)==1)
            numbers++;
        }
        return numbers;
    }
}