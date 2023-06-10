public class SkiRun {

    String name;
    private String symbol;
    private int difficultyLevel;
    private boolean runIsOpen;
    public SkiRun( String name , String symbol , int difficultyLevel ){
        this.name=name;
        this.symbol=symbol;
        this.difficultyLevel=difficultyLevel;
    }
    public String getName(){return name;}
    public String getSymbol(){return symbol;}
    public int getDifficultyLevel(){return this.difficultyLevel;}
    public boolean isOpen(){return runIsOpen;} // returns runIsOpen

    public void openRun() {this.runIsOpen=true;} // opens the run.
    public void closeRun(){this.runIsOpen=false;} // closes the run .

}
