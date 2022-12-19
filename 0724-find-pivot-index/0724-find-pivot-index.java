class Solution {
public int pivotIndex(int[] nums){
        int sum=0, sumLeft=0;
        //suma el total desde izquierda a derecha
        for(int x:nums){
            sum=sum+x;
            }

        for (int i=0; i < nums.length; i++){
            //si la suma a la izquierda es igual a == suma total - suma izquierda- valor del numero actual
            if(sumLeft==(sum-sumLeft-nums[i])){
                return i;
            }
            sumLeft=sumLeft+nums[i];
        }
        return -1;

}
}