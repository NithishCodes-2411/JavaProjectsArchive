class Car    {

    //attributes
    private int plateNumber;
    private double remainingFuel ;

    private CarModel [][] grid ;


    //constructor
    public Car( int plateNumber) {
        //super(modelName, fuelEconomy, tankCap);
        this.plateNumber = plateNumber;
        //this.remainingFuel = tankCap;
        CarModel [][] grid = new CarModel[plateNumber][plateNumber];

    }

    public void  setPlateNumber (int plateNumber){this.plateNumber= plateNumber;}
    public void setRemainingFuel (double remainingFuel){this.remainingFuel= remainingFuel;}


    public int getPlateNumber(){return this.plateNumber;}
    public double getRemainingFuel(){return this.remainingFuel;}

}
