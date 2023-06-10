    import java.util.ArrayList;

    public class Bottle {

        private int bottleRow;
        private int bottleColumn;
        private String bottleName;
        private String bottleMessage;
        private WorldMap worldMap;

        private String[][] map ;

        public Bottle (int bottleRow, int bottleColumn, String bottleName, String bottleMessage ){
            this.bottleRow = bottleRow;
            this.bottleColumn = bottleColumn;
            this.bottleName =  bottleName;
            this.bottleMessage = bottleMessage;

        }


        //setters
        public void setBottleRow(int row){this.bottleRow = row;}
        public void setBottleColumn(int column){this.bottleColumn = column;}
        public void setBottleName(String name){this.bottleName = name;}
        public void setBottleMessage(String msg){this.bottleMessage = msg;}
        public void setMap(WorldMap worldMap){
            this.worldMap = worldMap;
            this.map = worldMap.getWorldMap();
        }

        public String toString() {

            // a toString() method to print details about the bottle.
            String output ="";
            output += "Bottle named " +'"'+ bottleName + '"'+" starting at (" +bottleRow+","+bottleColumn+")";
            return output;

        }

        public WorldMap getWorldMap(){return this.worldMap;}

        public String  messageRecievedAt(){

            //This method returns a String called  output for each bootle

            boolean hit = true;
            String output="";
            output += bottleName +":Starting at ("+bottleRow+", "+bottleColumn+")"+"\n"+";";

            //An arrayList to store all the ex trajectory  of the bottle to check if the bottle is stuck or not.
            ArrayList <String> allTrajectory = new ArrayList<>();

            while(hit){
                boolean brk = false;

                for(int j=0; j<allTrajectory.size()-1; j++){
                    String [] exCoordinate = allTrajectory.get(j).split(" ");
                    if(Integer.parseInt(exCoordinate[0])==bottleRow && Integer.parseInt(exCoordinate[1])==bottleColumn){
                        brk = true;
                        output += ": "+ bottleName +" at (" + bottleRow +", "+bottleColumn+"): "+"<<NOW STUCK IN MID-OCEAN GYRE!>>" + '\n'+";";
                        break;
                    }
                }
                if(brk){
                    return output;
                    }


                //The next 5 if conditions identify the path of the bottle unitll it hits the land.
                if(this.map[bottleRow][bottleColumn].equals("S")){
                    output += ": "+ bottleName +" at (" + bottleRow +", "+bottleColumn+"): "+"In ocean, current taking it S."+'\n'+";";
                    String coordinate = bottleRow+" "+bottleColumn;
                    allTrajectory.add(coordinate);
                    bottleRow++;
                    continue;
                }
                if(this.map[bottleRow][bottleColumn].equals("N")){
                    output += ": "+ bottleName +" at (" + bottleRow +", "+bottleColumn+"): "+"In ocean, current taking it N."+'\n'+";";
                    String coordinate = bottleRow+" "+bottleColumn;
                    allTrajectory.add(coordinate);
                    bottleRow--;
                    continue;
                }
                if(this.map[bottleRow][bottleColumn].equals("E")){
                    output += ": "+ bottleName +" at (" + bottleRow +", "+bottleColumn+"): "+"In ocean, current taking it E."+'\n'+";";
                    String coordinate = bottleRow+" "+bottleColumn;
                    allTrajectory.add(coordinate);
                    bottleColumn++;
                    continue;
                }
                if(this.map[bottleRow][bottleColumn].equals("W")){
                    output += ": "+ bottleName +" at (" + bottleRow +", "+bottleColumn+"): "+"In ocean, current taking it W."+'\n'+";";
                    String coordinate = bottleRow+" "+bottleColumn;
                    allTrajectory.add(coordinate);
                    bottleColumn--;
                    continue;
                }
                if(this.map[bottleRow][bottleColumn].equals("X")){
                    output += ": "+ bottleName +" at (" + bottleRow +", "+bottleColumn+"): LANDED!"+'\n';
                    output+= "<<MESSAGE RECEIVED: "+ bottleMessage +">>"+'\n';
                    String coordinate = bottleRow+" "+bottleColumn;
                    allTrajectory.add(coordinate);
                    hit = false;
                    break;
                }
            }
            return output;
        }
    }
