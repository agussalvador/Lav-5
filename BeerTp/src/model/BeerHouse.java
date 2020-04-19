package model;

public class BeerHouse {

    //Attributes
    private int stock;
    private boolean available = false;

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
    public synchronized void BeerAdd(){
        while(available && this.stock == 100){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.stock += 1;
            available = true;
            notifyAll();
            System.out.println("productor stock=" +this.stock);
    }

    public synchronized void BeerDelete(){
        while (!available && this.stock == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.stock -= 1;
            System.out.println("consumidor stock=" +this.stock);
            available = false;
            notifyAll();
    }
}
