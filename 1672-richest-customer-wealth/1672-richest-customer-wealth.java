class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int [] richestWealth = new int[accounts.length];
            
        for(int i=0; i < accounts.length; i++){
            int sumArray=0;
            for (int j=0; j<accounts[i].length; j++){
                System.out.println(accounts[i][j]);
                sumArray=sumArray+accounts[i][j];
            }
             richestWealth[i]=sumArray;
            System.out.println("suma"+richestWealth[i]);
            
        }
        
        //now we find the largest value:
        int max=richestWealth[0];
        for(int i=1; i<richestWealth.length;i++){
            if(richestWealth[i]>max){
                max=richestWealth[i];
            }
            
        }
        return max;
       
        
        
                
                
    }
        }