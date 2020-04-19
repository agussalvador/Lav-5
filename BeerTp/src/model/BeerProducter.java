package model;

public class BeerProducter extends Thread {

    //attributes
    private BeerHouse beerHouse;
    //constructor
    public BeerProducter(BeerHouse b1) {
        this.beerHouse = b1;
    }

    @Override
    public void run() {

        int BeersAdds = 0;
        boolean flag = true;
        for (int i = 1; i <= 100; i++) {
            beerHouse.BeerAdd();
            /*BeersAdds ++;
            System.out.println("Total cervezas producidas:" +BeersAdds);*/
        }
    }
}
