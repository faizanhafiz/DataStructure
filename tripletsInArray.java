
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        
        int triplets=0;
        
        
        for(int i=0;i<arr.length-2;i++)
        {
            
            for(int j=i+1;j<arr.length-1;j++)
            {
                
                
                for(int k=j+1;k<arr.length;k++)
                {
                    int tripleSum=arr[i]+arr[j]+arr[k];
                    if(tripleSum==x)
                    {
                        
                        triplets++;
                    }
                    
                    
                    
                }
                
                
            }
            
            
            
            
        }
        
        
        return triplets;
        
    }

