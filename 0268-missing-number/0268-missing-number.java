import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int xor=0,i=0;
        for(i=0; i<n; i++){
           xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}