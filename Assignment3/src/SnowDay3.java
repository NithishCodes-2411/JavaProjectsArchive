/**
 * CSCI 1110 (W23)
 * @author Dr. Angela Siegel
 */

import java.util.*;

public class SnowDay3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //System.out.print("What's the name of the ski hill? ");
        String skiHillName = in.nextLine();
        System.out.println("Welcome to " + skiHillName + "!");
        System.out.println();


        SkiHill skiHill = new SkiHill(skiHillName);

        //System.out.print("How many ski runs from top of hill? ");
        int  numberRuns = in.nextInt();


        for (int i = 0; i < numberRuns ; i++) {
            //System.out.print("Enter run " + i + " info - Level(1-3) Name: ");
            int difficulty = in.nextInt();
            String runName = in.nextLine().trim();
            if (difficulty == 1) {
                skiHill.addSkiRun(new EasyRun(runName));
            } else if (difficulty == 2) {
                skiHill.addSkiRun(new MediumRun(runName));
            } else {
                skiHill.addSkiRun(new HardRun(runName));
            }
        }


        //problem3
        int numOfSkier = in.nextInt();
        in.nextLine();


        ArrayList<SkiRun> skiRun = skiHill.getSkiRuns();

        for (int i = 0; i < numOfSkier ; i++) {

            int skierLevel = in.nextInt();
            String skierName = in.nextLine();

            System.out.println("Welcome " + skierName);
            System.out.println("Your ski level is: " + skierLevel);
            System.out.println();
            System.out.println("For your level, check out these runs:");

            Skier skier = new Skier(skierName, skierLevel);
            int count = 0;

            for(int j = 0; j < skiRun.size(); j++){

                if(skier.canSki(skiRun.get(j))){
                    count++;
                    System.out.print(count + ". " + skiRun.get(j).getName() + " (");
                    System.out.print( skiRun.get(j).getSymbol() + " - Level" + skiRun.get(j).getDifficultyLevel());
                    System.out.println();
                }
                if(j == skiRun.size()-1){
                    System.out.println();
                }
            }
        }
    }
}

