

bool isValidSudoku(char** board, int boardSize, int* boardColSize)
{
    int i,j,k,q;
    int arr[10];
        for(j = 0; j < 9; j++)
        {
            for(k = 0 ; k < 9 ; k++)
                arr[k] = 0;
            for(i = 0; i < 9; i++)
          {
             if(board[j][i] > 47 && board[j][i] < 58)
               {
                 if(arr[board[j][i] -48] == 1)
                    return false;
                 else
                    arr[board[j][i] - 48] = 1;
               }       
          }
        }
  
        for(q = 0; q < 3 ; q++)
        {
           for(k = 0 ; k < 9 ; k++)
               arr[k] = 0;
           for(j = q * 3; j < (q+1) * 3; j++)
           {
              for(i = q * 3; i < (q+1) * 3; i++)
              {
               if(board[j][i] >47 && board[j][i] < 58)
               {
                 if(arr[board[j][i] -48] == 1)
                    return false;
                 else
                    arr[board[j][i] - 48] ++;
               }      
              }
           }
        }
    return true;

}