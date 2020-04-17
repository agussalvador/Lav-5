package Model;

import Interfaces.DrinkVikingImp;
import Interfaces.UrinateVikingImp;

public class Viking extends Human implements UrinateVikingImp, DrinkVikingImp {

    //Attributes
    private int proDrinker;

    //Constructor
    public Viking(String name, int age, float weight,int proDrinker) {
        super(name, age, weight);
        this.proDrinker = proDrinker;
    }

    //Getters and Setters
    public int getProDrinker() {
        return proDrinker;
    }

    public void setProDrinker(int proDrinker) {
        this.proDrinker = proDrinker;
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

    @Override
    public String toString() {
        return "Viking{" +
                "proDrinker=" + proDrinker +
                '}';
    }
}
