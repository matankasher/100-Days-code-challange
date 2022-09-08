class Solution {
   public void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
  
public int partition(int[] arr, int low, int high)
{
      
    // pivot
    int pivot = arr[high]; 
      
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
          
        // If current element is smaller 
        // than the pivot
        if (arr[j] < pivot) 
        {
              
            // Increment index of 
            // smaller element
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
  
/* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
 */
  
    public void quickSort(int[] arr, int low, int high)
{
    if (low < high) 
    {       
        // pi is partitioning index, arr[p]
        // is now at right place 
        int pi = partition(arr, low, high);
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
     public int[] realPlace(int[] nums, int i , int j, int ai ,int aj) 
    { // find the location of our integer at the arr.
        int k;
        for( k = 0; k < nums.length; k++)                                              
           {
            if(nums[k] == ai)
            {
               i = k;
               k++;
               break;
            }
           }
               for( k= k; k < nums.length; k++)                                          
           {
            if(nums[k] == aj)
            {
               j = k;
               break;
            }
           }
            
         int[] temp = new int[] {i,j};
        return temp;
    }
}

    public int[] twoSum(int[] nums, int target) {
        int[] a = nums.clone();   
        quickSort(a, 0, nums.length-1);  // a is a sort arr of nums
        int i = 0 , j = nums.length-1 ;
        while (i < j)     
        {
            if (a[i] + a[j] == target) 
             // when we found the integer, we are looking for thier positions at the original arr.
            {
                return realPlace(nums,i,j, a[i], a[j]);
            }
            else
                if (a[i] + a[j] < target)
                {
                    i++;
                }
            else
                j--;
        }
        return null;
    }












