public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];

        for (int i = 0 ; i < numRows ; i++){
            for (int j = 0 ; j < numCols ; j++){
                int chance = (int)(Math.random()*100 + 1);

                if(chance <= 40){
                    lights[i][j] = true;
                }
                else{
                    lights[i][j] = false;
                }
            }
        }
    }

    public boolean evaluateLight(int rowNo , int colNo){
        int noOfLightsOnInCol = 0;
        for(int i = 0 ; i < lights.length ; i++){
            if(lights[i][colNo]){
                noOfLightsOnInCol++;
            }
        }
        if(lights[rowNo][colNo] && noOfLightsOnInCol%2==0){
            return false;
        }
        if(lights[rowNo][colNo] == false && noOfLightsOnInCol%3==0){
            return true;
        }
        
        return lights[rowNo][colNo];
    }
    public static void main(String[] args){
        LightBoard sim = new LightBoard(7, 5);

        System.out.println(sim.evaluateLight(0, 3));
        System.out.println(sim.evaluateLight(6, 0));
        System.out.println(sim.evaluateLight(4, 1));
        System.out.println(sim.evaluateLight(5, 4));
    }
}
