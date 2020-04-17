package model;

public class BeerHouse {

    //Attributes
    private int stock;

    //Constructor

    public BeerHouse(int stock) {
        this.stock = stock;
    }

    //Geters and setters

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Custom methods
    public synchronized void BeerAdd(int cant){
        if((this.stock + cant) <= 100){
            this.stock += cant;
        }
    }

    public synchronized void BeerDelete(int cant){
        if(this.stock >= cant){
            this.stock -= cant;
        }
    }
}
