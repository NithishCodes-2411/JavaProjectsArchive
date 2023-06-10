import java.util.ArrayList;
public class SkiHill {
    private String name;
    private ArrayList<SkiRun> skiRuns ;

    public SkiHill (String name){
        this.name=name;
        skiRuns = new ArrayList<SkiRun>();
    }

    public String getName(){return name;}

    public ArrayList<SkiRun> getSkiRuns(){return this.skiRuns;}
    public void addSkiRun (SkiRun skiRun){this.skiRuns.add(skiRun);}

    public int numberSkiRuns(){return skiRuns.size(); }

    public void openHill(){ // Opens all ski runs at the hill
        for (int i = 0; i < this.skiRuns.size(); i++){
            this.skiRuns.get(i).openRun();
        }
    }

    public void closeHill(){ //Closes all ski runs at the hill
        for(int i = 0; i < this.skiRuns.size(); i++){
            this.skiRuns.get(i).closeRun();
        }
    }
    public int numberOpenRuns(){ //  Returns the number of open runs at the hill.
        int count = 0;
        for (int i = 0; i < this.skiRuns.size(); i++){
            if(this.skiRuns.get(i).isOpen()){
                count ++;
            }
        }
        return count ;
    }
    public int numberClosedRuns(){ //Returns the number of closed runs at the hill
        int count = 0;
        for (int i = 0; i < this.skiRuns.size(); i++){
            if(!this.skiRuns.get(i).isOpen()){
                count ++;
            }
        }
        return count ;
    }
    public ArrayList<SkiRun> getOpenRuns(){ //Returns an ArrayList of type SkiRun containing all open runs at the hill
        ArrayList<SkiRun> openRuns = new ArrayList<>();
        for (int i = 0; i <this.skiRuns.size(); i++){
            if(this.skiRuns.get(i).isOpen()){
                openRuns.add(this.skiRuns.get(i));
            }
        }
        return openRuns;
    }
    public ArrayList<SkiRun> getClosedRuns(){ //Returns an ArrayList of type SkiRun containing all closed runs at the hill.
        ArrayList<SkiRun> openRuns = new ArrayList<>();
        for (int i = 0; i <this.skiRuns.size(); i++){
            if(!this.skiRuns.get(i).isOpen()){
                openRuns.add(this.skiRuns.get(i));
            }
        }
        return openRuns;
    }
}
