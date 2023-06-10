import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main (String [] args){
        String[] strs =


            public List<List<String>> groupAnagrams(String[] strs) {
                ArrayList < ArrayList<String> > big = new ArrayList <>();
                ArrayList <String> small = new ArrayList<>();

                for(int i=0; i< strs.length; i++){
                    boolean found = false;
                    for(int j=0; j< strs.length; j++){
                        String ii = strs[i];
                        String jj = strs[j];
                        int count=0;
                        for(int k=0; k < ii.length(); k++){
                            for(int l=0; l < jj.length(); j++){
                                if(ii.charAt(k)==jj.charAt(l)){
                                    count++;
                                    jj.charAt(K).remove();
                                }
                            }
                            if(count == ii.length && count== jj.length){
                                small.add(ii);
                                found = true;
                            }
                        }

                    }
                    if(found){
                        big.add(small);
                    }

                }



//        Scanner in = new Scanner(System.in);
//
//        int rows = in.nextInt();
//        int columns = in.nextInt();
//        in.nextLine();
//
//        WorldMap map = new WorldMap();
//
//        map.setWorldMap(rows,columns);
//
//        String land = in.nextLine();
//        String[] arrayOfAllLands = land.split(" ");
//
//        for(int i=0; i <arrayOfAllLands.length; i++){
//
//            //sending all the landlocation to setLandLocation method in Worldmap class
//            String[] rowAndCol = arrayOfAllLands[i].split(",");
//            int row = Integer.parseInt(rowAndCol[0]);
//            int col = Integer.parseInt(rowAndCol[1]);
//            map.setLandLocation(row , col);
//
//        }
//
//        String currentDirection = in.nextLine();
//
//        String [] allCurrentDirections = currentDirection.split(" ");
//
//        for(int i=0; i< allCurrentDirections.length ;i++){
//
//            // sending all the directions to setCurrentDirection method in Worldmap class.
//            map.setCurrentDirection(allCurrentDirections[i]);
//
//        }
//
//        System.out.print(map.toString());
//
//        int numOfBottles = in.nextInt();

        //An arrayList to collect all the Bottle objects
//        ArrayList<Bottle> bottleObjects = new ArrayList<>();
//
//        for(int i=0; i<numOfBottles; i++){
//
//            int bottleRow = in.nextInt();
//            int bottleCol = in.nextInt();
//            String bottleName = in.nextLine();
//            String bottleMessage =in.nextLine();
//
//            //priniting the output
//            Bottle bottle = new Bottle( bottleRow,bottleCol , bottleName,bottleMessage);
//            System.out.println(bottle.toString());
//            bottleObjects.add(bottle);

        }
    }
}