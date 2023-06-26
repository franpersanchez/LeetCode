class Solution {
    public boolean isPalindrome(String s) {
        
        //Removing all non-alphanumeric characters
        String str = "";
        String sn = s.toLowerCase();
        for(int i=0;i<sn.length();i++){   
            char c = sn.charAt(i);
            
            if(c>='a'&&c<='z')str+=c;
            if((c-'0')>=0 &&(c-'0')<=9)str+=c;
        }
        
        if(str.length()==0) return true;
        
        for(int i=0; i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }return true;
        
    }
}