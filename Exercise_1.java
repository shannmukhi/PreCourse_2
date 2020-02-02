class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    {
        //Write your code here
        if( r>=1 )
        {
        int mv = (l+r)/2;
        if ( arr[mv] == x )
        return mv;
        else if ( arr[mv] >  x )
        return binarySearch( arr,l,mv-1,x );
        else if( arr[mv] < x )
        return binarySearch( arr,mv+1,r,x );
        } 
 return -1;
      }
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 

