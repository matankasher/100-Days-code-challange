class Solution {
    public int firstMissingPositive(int[] nums)
    {
        int j;
        int [] arr = new int [nums.length];
        for (j = 0; j < nums.length; j++ )
        {
            if(nums[j] > 0 && nums[j] <= nums.length )
            arr [nums[j] -1 ] = 1;
        }
        for (j = 0; j < arr.length; j++ )
        {
            if(arr[j] == 0)
            return j+1;
        }
        return j+1;
    }
}