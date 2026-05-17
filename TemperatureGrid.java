public class TemperatureGrid
{
    /** A two-dimensional array of temperature values, initialized in the constructor (not shown)
        * Guaranteed not to be null
        */
    private double[][] temps;
    /** Computes and returns a new temperature value for the given location.
        * @param row a valid row index in temps
        * @param col a valid column index in temps
        * @return the new temperature for temps [row] [col]
        * - The new temperature for any element in the border of the array is the
        * same as the old temperature.
        * - Otherwise, the new temperature is the average of the four adjacent entries.
        * Postcondition: temps is unchanged.
        */
    private double computeTemp(int row, int col)
    { /* to be implemented in part (a) */ 
        if(row == 0 || row == temps.length - 1 || col == 0 || col == temps[0].length - 1){
            return temps[row][col];
        }
        double sum = temps[row + 1][col] + temps[row - 1][col] + temps[row][col + 1] + temps[row][col - 1];

        return sum/4;
    }
    /** Updates all values in temps and returns a boolean that indicates whether or not all the
        * new values were within tolerance of the original values.
        * @param tolerance a double value >= 0
        * @return true if all updated temperatures are within tolerance of the original values;
        * false otherwise.
        * Postcondition: Each value in temps has been updated with a new value based on the
        * corresponding call to computeTemp.
        */
    public boolean updateAllTemps(double tolerance)
    { /* to be implemented in part (b) */ 
         double[][] newTemps = new double[temps.length][temps[0].length];
         double[][] temp = new double[temps.length][temps[0].length];

         for(int i = 0 ; i < temps.length ; i++){
            for(int j = 0 ; j < temps[0].length ; j++){
                temp[i][j] = temps[i][j];
            }
         }


         for(int i = 0 ; i < temps.length ; i++){
            for(int j = 0 ; j < temps[0].length ; j++){
                newTemps[i][j] = computeTemp(i,j);
            }
         }

         for(int i = 0 ; i < temps.length ; i++){
            for(int j = 0 ; j < temps[0].length ; j++){
                temps[i][j] = newTemps[i][j];
            }
         }

         for(int i = 0 ; i < temps.length ; i++){
            for(int j = 0 ; j < temps[0].length ; j++){
                if(Math.abs(temp[i][j] - temps[i][j]) > tolerance){
                    return false;
                }
            }
         }
        return true;
    }   
    // There may be instance variables, constructors, and methods that are not shown.
}