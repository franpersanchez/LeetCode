class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum=0;
        int highest = 0;

        for (int i = 0; i <gain.length; i++){
            sum = sum+gain[i];
            highest = Math.max(highest, sum);

        }
        return highest;

    }
    
}