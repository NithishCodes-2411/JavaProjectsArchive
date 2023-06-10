import javax.lang.model.type.NullType;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0;

        ArrayList<CarModel> allModels = new ArrayList<>(); // arraylist to store CarModel objects
        ArrayList<Car> allCars = new ArrayList<>(); // arraylist  to store Car objects
        ArrayList<String> allTrips = new ArrayList<String>(); // arrayList to store all the trips

        while ( true ) {
            String input = in.nextLine();
            if ( input.equals("FINISH") ) {
                break;
            }

            // spliting the input line  to access the individual input while controlling the leading spaces.
            String[]inputSplit = input.replaceAll("(^\\s+|\\s+$)", "").split("\\s+");

            if ( inputSplit[0].equals("MODEL") ) { // gathering model line of input
                CarModel x = new CarModel(inputSplit[1], Double.parseDouble(inputSplit[2]), Double.parseDouble(inputSplit[3]));

                allModels.add(x);
            }else if ( inputSplit[0].equals("CAR") ) { // gathering car line of input
                for(int j = 0; j < allModels.size(); j++) {
                    if ( allModels.get(j).getModelname().equals(inputSplit[1]) ) {
                        Car y = new Car( Integer.parseInt(inputSplit[2]));
                        allCars.add(y);
                    }
                }
            } else if ( inputSplit[0].equals("REFILL") ) { // gathering refill line of input
                for (int j = 0; j < allCars.size(); j++) {
                    if ( allCars.get(j).getPlateNumber() == Integer.parseInt(inputSplit[1]) )  {
                        //allCars.get(j).setRemainingFuel(allCars.get(j).getTankCap());
                    }
                }
            } else if ( inputSplit[0].equals("TRIP") ) { // gathering trip line of input

                allTrips.add(input);
                boolean found  = false;
                int counter = 0;

                //looping through objects in allCars for calculations
                for (int j = 0; j < allCars.size(); j++) {

                    if (allCars.get(j).getPlateNumber() == Integer.parseInt(inputSplit[1])) {
                        found = true;
                        counter  = counter + 1;
                        double fuelConsumption = ( (Double.parseDouble(inputSplit[2]) ) / 100.0);
                        if( fuelConsumption <= allCars.get(j).getRemainingFuel() ){
                            System.out.println( "Trip completed successfully for #"+ inputSplit[1] );
                            allCars.get(j).setRemainingFuel(allCars.get(j).getRemainingFuel()- fuelConsumption);
                        }
                        else if  ( fuelConsumption > allCars.get(j).getRemainingFuel() ){
                            System.out.println( "Not enough fuel for #" + inputSplit[1] );
                            allCars.get(j).setRemainingFuel(0);
                        }
                    }
                }

                if( !found && counter == allCars.size() ){
                    System.out.println( "Not enough fuel for #" + inputSplit[1] );
                }
            }
            else if (inputSplit[0].equals("LONGTRIPS")){

                int count = 0 ;

                for (int k = 0 ; k < allCars.size() ; k++){
                    //allCars.get(k).setRemainingFuel(allCars.get(k).getTankCap());
                }


                for(int j = 0; j < allTrips.size(); j++){
                    String [] allTripsArray  = allTrips.get(j).replaceAll("(^\\s+|\\s+$)", "").split("\\s+");

                    if( inputSplit[1].equals(allTripsArray[1]) ){ // finding thr right trip
                        for (int k = 0 ; k < allCars.size(); k++){
                            if( Integer.parseInt( inputSplit[1]) == allCars.get(k).getPlateNumber() ){ // finding the right car details

                                double fuelConsumption = (( Double.parseDouble(allTripsArray[2])  /  100.0));
                                if( fuelConsumption <= allCars.get(k).getRemainingFuel()){
                                    if(Integer.parseInt(allTripsArray[2]) >= Integer.parseInt(inputSplit[2])){
                                        count++;
                                    }
                                    allCars.get(k).setRemainingFuel(allCars.get(k).getRemainingFuel() - fuelConsumption );
                                }
                                else{
                                    allCars.get(k).setRemainingFuel( 0 );
                                }
                            }
                        }
                    }
                }
                System.out.println("#" + inputSplit[1] + " made " + count +" trips longer than " + inputSplit[2]);
            }
        }
    }
}
