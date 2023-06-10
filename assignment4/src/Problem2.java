import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int columns = in.nextInt();
        in.nextLine();

        WorldMap map = new WorldMap();

        map.setWorldMap(rows,columns);

        String land = in.nextLine();
        String[] arrayOfAllLands = land.split(" ");

        for(int i=0; i <arrayOfAllLands.length; i++){

            //sending all the landlocation to setLandLocation method in Worldmap class
            String[] rowAndCol = arrayOfAllLands[i].split(",");
            int row = Integer.parseInt(rowAndCol[0]);
            int col = Integer.parseInt(rowAndCol[1]);
            map.setLandLocation(row,col);

        }

        String currentDirection = in.nextLine();

        String [] allCurrentDirections = currentDirection.split(" ");

        for(int i=0; i< allCurrentDirections.length; i++){

            // passing all the directions to setCurrentDirection method in Worldmap class.
            map.setCurrentDirection(allCurrentDirections[i]);

        }

        int numOfBottles = in.nextInt();

        //An arrayList to collect all the Bottle objects
        ArrayList<String> bottleObjs = new ArrayList<String>();

        for(int i=0; i<numOfBottles; i++){

            int bottleRow = in.nextInt();
            int bottleCol = in.nextInt();
            String bottleName = in.nextLine();
            String bottleMessage =in.nextLine();

            Bottle bottle = new Bottle(bottleRow, bottleCol, bottleName, bottleMessage);

            bottle.setMap(map);

            bottleObjs.add(bottle.messageRecievedAt());

        }

        //An arraylist to store all the output of bottle objects
        ArrayList<String[]> splittedArraylist = new ArrayList<>();

        for(int i=0; i<bottleObjs.size(); i++){
            String [] bottleResult = bottleObjs.get(i).split(";");
            splittedArraylist.add(bottleResult);
        }

        //Finding the String[] with longest length
        int max = splittedArraylist.get(0).length;
        for(int i=1; i<splittedArraylist.size(); i++){
            if(splittedArraylist.get(i).length>max){
                max = splittedArraylist.get(i).length;
            }
        }

        //Printing the output in  correct order.
        for(int i=0; i<max; i++){
            for(int j=0; j<splittedArraylist.size(); j++){
                if(i<splittedArraylist.get(j).length) {
                    if(i==0){
                        System.out.print(splittedArraylist.get(j)[i]);
                    }
                    if(i!=0){
                        System.out.print(i-1);
                        System.out.print(splittedArraylist.get(j)[i]);
                    }
                }
            }
        }
    }
}