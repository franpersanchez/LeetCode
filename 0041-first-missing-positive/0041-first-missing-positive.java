class Solution {
     public int firstMissingPositive(int[] nums) {
            //creamos un Set Collection a partir del Array. Distinct para decir que no haya repetidos. boxed para pasar las
            //variables como Integer no como int. "Integer wraps a value of the primitive type int in an object".
            //toSet collector is used for collecting all Stream elements into a Set instance
            Set<Integer> setOfUniques = Arrays.stream(nums).distinct().boxed().collect(Collectors.toSet());

            
            int index=1;
//we dont know the number of iterations therefore it is a "while" loop
            while(true) {
                if(!setOfUniques.contains(index)){
                    return index;
                }
                index++;
            }

        }}
         