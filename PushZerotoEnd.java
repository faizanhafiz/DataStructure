public class Solution {  
    public static void  swap(int arr[] ,int a , int b)
    {
        
        
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]= tmp;
    }

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int zeros=0;
         for(int i=0;i<arr.length;i++)
         {
             
             if(arr[i]==0)
             {
                zeros++;
             }
             
             
             
         }
        
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[k++]=arr[i];
            }
            
            
        }
        
        while(zeros--!=0)
        {
            arr[k++]=0;
        }
        
    }

