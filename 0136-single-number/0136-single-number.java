class Solution {
    public int singleNumber(int[] nums) {
        int helper=nums[0];
        
        for(int i=1; i<nums.length; i++){
            helper= helper ^ nums[i];
        }
        return helper;
    }
}