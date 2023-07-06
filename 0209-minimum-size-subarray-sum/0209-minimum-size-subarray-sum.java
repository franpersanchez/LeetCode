class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int windowsLength = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==target) return 1;

            sum = sum + nums[i];
            while (sum >= target) {

                windowsLength=Math.min(windowsLength,i+1-start);
                sum=sum-nums[start];
                start++;

            }

        }
        return windowsLength> nums.length? 0 : windowsLength;
    }
}