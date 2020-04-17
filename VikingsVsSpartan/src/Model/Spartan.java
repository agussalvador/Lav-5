package Model;

import Interfaces.DrinkSpartanImp;
import Interfaces.Urinate;
import Interfaces.UrinateSpartanImp;

public class Spartan extends Human implements UrinateSpartanImp, DrinkSpartanImp {

    //Attributes
    private int extraTolerance;

    //Constructor
    public Spartan(String name, int age, float weight, int extraTolerance) {
        super(name, age, weight);
        this.extraTolerance = extraTolerance;
    }

    //Getters and Setters
    public int getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(int extraTolerance) {
        this.extraTolerance = extraTolerance;
    }


    //Custom methods
    @Override
    public void drink() {
        System.out.println("I'm a Spartan and i'm drinking");
    }

    @Override
    public void urinate() {
        System.out.println("I'm a Spartan and i'm urinating");
    }



}
