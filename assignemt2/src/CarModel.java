import java.util.ArrayList;

public class CarModel {

    //attributes
    protected   String  modelName ;
    protected  double  fuelEconomy ;
    protected  double tankCap ;




    //constructor
    public CarModel(String modelName , double fuelEconomy , double tankCap){
        this.modelName = modelName;
        this.fuelEconomy = fuelEconomy;
        this.tankCap  = tankCap;
    }

    //setter

    public void setModelname(String modelname){ this.modelName = modelname; }

    public void setFuelEconomy(double fuelEconomy){ this.fuelEconomy = fuelEconomy;}

    public void setTankC(double tankCap ){ this.tankCap = tankCap; }


    //getters
    public String getModelname () { return modelName; }
    public double  getFuelEconomy () { return fuelEconomy; }
    public double getTankCap () { return tankCap; }


}
