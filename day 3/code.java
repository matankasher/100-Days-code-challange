class Solution {

  public int R(int x , int i) 
  {     if (i == 0)
            return 0;
        return   (int) ((x % 10) * (Math.pow(10,i-1)))
                  + R ((int) x/10 , --i);
  }
    public int reverse(int x) {
      int temp = x, i = 0 ;
      while (temp != 0)   // count digits of num
      {
        temp = (int) temp / 10;
        i++;
      }
      if(x > 0)
        return R(Math.abs(x) ,i);
      return (0 - R(Math.abs(x) ,i));
    }
}