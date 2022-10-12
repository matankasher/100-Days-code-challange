#define MAX(x, y) (((x) > (y)) ? (x) : (y))
int maxSubArray(int* nums, int numsSize){  
    int max = INT_MIN ,i , temp = 0;
    for (i = 0 ; i < numsSize ; i++)
    {
        temp = temp + nums[i];
        max = MAX(temp,max);
        if(temp < 0) 
           temp = 0;
    }
     return max;    
}
    