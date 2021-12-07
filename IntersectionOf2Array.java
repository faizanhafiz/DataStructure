  public static void intersections(int arr1[], int arr2[])
    {
    	
        
    for(int i=0;i<arr1.length;i++)
    {
        int elem = arr1[i];
        for(int j=0;j<arr2.length;j++)
        {
		
        if(elem==arr2[j])
        {
            
            System.out.print(elem+" ");
            arr2[j]= -1;
            break;
        }
            
        
        }
