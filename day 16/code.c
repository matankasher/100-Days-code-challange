int* plusOne(int* digits, int digitsSize, int* returnSize)
{
    int crried = 1 ;
    int *arr = malloc((digitsSize + 1)*sizeof(int));  // we allocate one more position because
                                                      // the num might wiil grow at one digit.
    for(int i = digitsSize -1 ; i >= 0; i--)
    {
        arr[i+1] = (digits[i] + crried ) % 10;
        crried = (digits[i] + crried ) / 10;
        
    }
    if(arr[1] != 0)   // check if we need another place for digit that we aallready allocated.
    {
        *returnSize = digitsSize;
        return ++arr;  // we will return the arr from the second position 
                       // because we dont nedd the additional place of the arr.
    }
    arr[0] = 1;
    *returnSize = digitsSize +1;
    return arr;
}