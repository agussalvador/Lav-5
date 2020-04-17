package model;


public class BeerConsumer extends Thread{
    //attributes
    private BeerHouse beerHouse;
    //constructor
    public BeerConsumer(BeerHouse b1) {
        this.beerHouse = b1;
    }

    @Override
    public void  run() {

        //int BeersDeleted = 0;

        while (true){
            //int BeersToDelete = 1+(int)(Math.random()*((100)+1));
            beerHouse.BeerDelete();
            /*BeersDeleted ++;
            System.out.println("Total cervezas consumidas:" +BeersDeleted);*/
        }
    }

}
