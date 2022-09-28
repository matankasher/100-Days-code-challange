class Solution {
  public int removeDuplicates(int[] nums) {
      int currPos = 1 ,currNum = nums[0];    
      for(int i = 1 ; i < nums.length ; i++)
      {
          if(nums[i] != currNum)
          {
              nums[currPos] = nums[i];
              currPos ++;
              currNum = nums[i];
          }
      }
      return currPos ;   
  }
}