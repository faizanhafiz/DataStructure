public class Solution {  

    public static int pairSum(int arr[], int x) 
    {
    	//Your code goes here
       int pair=0;
         
        
        
            
            for(int i=0;i<arr.length;i++)
            {
                
                
                
                for(int j=i+1;j<arr.length;j++)
                { 
                    
                    if(arr[i]+arr[j]==x)
                    {
                        pair++;
                    }
                    
                    
                    
                }
                
             
            
            
            
        }
        
        return pair;
        
    }
