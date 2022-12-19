import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> mapList = new HashMap();
        mapList.put('I',1);
        mapList.put('V',5);
        mapList.put('X',10);
        mapList.put('L',50);
        mapList.put('C',100);
        mapList.put('D',500);
        mapList.put('M',1000);
        System.out.println(mapList);

        int sum=0;
        int next;
        int prev=mapList.get(s.charAt(0));

        for(int i=1; i<s.length();i++){
            next=mapList.get(s.charAt(i));
            if(prev<next){
                sum=sum-prev;
            }else {
                sum=sum+prev;
            }
                prev=next;
        }
    
        sum=sum+prev;
         return sum;
     }

}
