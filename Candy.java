public class Candy{


    private String flavor;
    
    /** Creates a new piece of Candy with specified flavor **/
    public Candy(String flavor)
    {
        this.flavor = flavor;
    }
    
    /** Returns a String representing the flavor of this piece of candy */
    public String getFlavor()
    {
        return flavor;
    }

    // There may be instance variables, constructors, and methods that are not shown.








    public class BoxOfCandy
{
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;


    public BoxOfCandy(int numRows, int numCols)
    {
        box = new Candy[numRows][numCols];
    }
    
    public void addCandy(Candy candy, int row, int col){
        if(row >= 0 && col >= 0 && row < box.length && col < box[0].length){
            box[row][col] = candy;
        }
    }

    /**
     * Moves one piece of candy in column col, if necessary and possible, so that the
     * box element in row 0 of column col contains a piece of candy, as described in part (a).
     * Returns false if there is no piece of candy in column col and returns true otherwise.
     * Precondition: col is a valid column index in box.
     */
    public boolean moveCandyToFirstRow(int col)
    {
        /* to be implemented in part (a) */

        if(box[0][col] != null){
            return true;
        }

        for(int i = 1 ; i < box.length ; i++){
            if(box[i][col] != null){
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Removes from box and returns a piece of candy with flavor specified by the parameter, or
     * returns null if no such piece is found, as described in part (b)
     */
    public Candy removeNextByFlavor(String flavor)
    {

        Candy testCandy;

        /* to be implemented in part (b) */
        for(int row = box.length - 1 ; row >=0 ; row++){
            for(int col = 0 ; col < box[0].length ; col++){
                if(box[row][col] != null && box[row][col].getFlavor().equals(flavor)){
                    testCandy = box[row][col];
                    box[row][col] = null;
                    return testCandy;
                }
            }
        }
        return null;
    }

    // There may be instance variables, constructors, and methods that are not shown.
    
    public Candy[][] getCandy() 
    {
        return box; 
    }
    
    public String toString() 
    {
        String res = "Candy Box: \n";
        for(Candy[] row : box)
        {
            for(Candy elem : row)
            {
                if(elem != null)
                {
                    res += elem.getFlavor() + " ";    
                } 
                else
                {
                    res += " [___] ";
                }
            }
            res += '\n';
        }
        
        return res;
    }
}
    

}

