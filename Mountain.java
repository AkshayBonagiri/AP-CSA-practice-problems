public class Mountain
{
    /** @param array an array of positive integer values
        * @param stop the last index to check
        * Precondition: 0 s stop <array. length
        * @return true if for each j such that 0\leqj<stop, array[j] < array[j + 1] ;
        * false otherwise
        */
    public static boolean isIncreasing(int[] array, int stop)
    { /* implementation not shown */ }
    /** @param array an array of positive integer values
        * @param start the first index to check
        * Precondition: 0 s start <array.length - 1
        * @return true if for each j such that start \leqj<array.length - 1,
        * array[j] > array[j + 1];
        * false otherwise
        */
    public static boolean isDecreasing(int[] array, int start)
    { /* implementation not shown */ }
    /** @param array an array of positive integer values
        * Precondition: array.length > 0
        * @return the index of the first peak (local maximum) in the array, if it exists;
        * -1 otherwise
        */
    public static int getPeakIndex(int[] array)
    { /* to be implemented in part (a) */ 
        for(int i = 1 ; i < array.length - 1 ; i++){
            int before = array[i - 1];
            int current = array[i];
            int after = array[i+1];
            if(current > before && current > after){
                return i;
            }
        }
        return -1;
    }
    /** @param array an array of positive integer values
        * Precondition: array.length > 0
        * @return true if array contains values ordered as a mountain;
        * false otherwise
        */
    public static boolean isMountain(int[] array)
    { /* to be implemented in part (b) */ 
        boolean hasPeak = false;
        int peakIdx = getPeakIndex(array);

        if(peakIdx != -1){
            hasPeak = true;
        }

        boolean smaller = isIncreasing(array, peakIdx);
        boolean larger = isDecreasing(array, peakIdx);

        return hasPeak && smaller && larger;
    }
    // There may be instance variables, constructors, and methods that are not shown.
}