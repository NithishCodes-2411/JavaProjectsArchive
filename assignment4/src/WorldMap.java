public class WorldMap {
    private int rows;
    private int columns;
    private String[][] worldMap;


    public WorldMap(){}

    public void setRows(int numOfRows){this.rows = numOfRows;}
    public void setColumns(int numOfColumns){this.columns = numOfColumns;}
    public void setWorldMap( int rows , int columns ){

        //sets all the locations in the map to ocean.("O")
        this.worldMap = new String [rows][columns];
        for(int i =0; i< rows; i++){
            for(int j=0; j < columns; j++){
                this.worldMap[i][j] = "O";
            }
        }
        setRows(rows);
        setColumns(columns);
    }
    public void setLandLocation (int row, int column ){

        //sets the given location into land.("X")
        this.worldMap[row][column] = "X";
    }
    public void setCurrentDirection (String  direction ){

        //setting all the direction
        for(int i=0; i< this.rows ;i++){
            boolean brk = false;// a boolean to break both loop at the same time.
            for(int j=0; j< this.columns ;j++){
                if(this.worldMap[i][j].equals("O")){
                    this.worldMap[i][j] = direction;
                    brk = true;
                    break;
                }
            }
            if(brk){
                break;
            }
        }
    }
    public String[][] getWorldMap(){return this.worldMap;}
    public int getRows(){return this.rows;}
    public int getColumns(){return this.columns;}


    public String toString(){

        //a toString() to print out the 2d array
        StringBuilder output = new StringBuilder();
        for(int i=0; i< this.rows ;i++){
            for(int j=0; j< this.columns ;j++) {
                output.append(this.worldMap[i][j]);
            }
            output.append('\n');
        }
        return output.toString();
    }
}
