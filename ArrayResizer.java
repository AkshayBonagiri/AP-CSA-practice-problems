public class ArrayResizer
{
    /** Returns true if and only if every value in row r of array2D is non-zero.
     *  Precondition: r is a valid row index in array2D.
     *  Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r)
    { /* to be implemented in part (a) */
        for(int i = 0 ; i < array2D[r].length ; i++){
            if(array2D[r][i] == 0){
                return false;
            }
        }
        return true;
     }

    /** Returns the number of rows in array2D that contain all non-zero values.
     *  Postcondition: array2D is unchanged.
     */
    public static int numNonZeroRows(int[][] array2D)
    { /* implementation not shown */ 
        int count = 0;

        for(int i = 0 ; i < array2D.length ; i++){
            if(isNonZeroRow(array2D, i)){
                count++;
            }
        }
        return count;
    }

    /** Returns a new, possibly smaller, two-dimensional array that contains only rows
     *  from array2D with no zeros, as described in part (b).
     *  Precondition: array2D contains at least one column and at least one row with no zeros.
     *  Postcondition: array2D is unchanged.
     */
    public static int[][] resize(int[][] array2D)
    { /* to be implemented in part (b) */ 
        int[][] arr = new int[numNonZeroRows(array2D)][array2D[0].length];
        int count = 0;

        for(int i = 0 ; i < array2D.length ; i++){
            if(isNonZeroRow(array2D, i)){
                for(int j = 0 ; j < arr[0].length ; j++){
                    arr[count][j] = array2D[i][j];
                }
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[][] arr1 =    {
                            {2,1,0},
                            {1,3,2},
                            {0,0,0},
                            {4,5,6}
                            };

    System.out.println(isNonZeroRow(arr1, 3));
    


    int[][] arr2 = resize(arr1);

    for(int val[] : arr2){
        for(int val1 : val){
            System.out.print(val1);
        }
        System.out.println("");
    }
}
    
}