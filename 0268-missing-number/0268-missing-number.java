import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int xor=0;
        for(int i=0; i<n; i++){
           xor = xor ^ i ^ nums[i];
        }
       
        return xor ^ n ;
    }
}