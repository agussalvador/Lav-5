package model;

public class BeerProducter extends Thread implements Runnable {

    //attributes
    private BeerHouse beerHouse;
    //constructor
    public BeerProducter(BeerHouse b1) {
        this.beerHouse = b1;
    }

    @Override
    public synchronized void run() {

        int BeersAdds = 0;
        int TimesToAdd =  1+(int)(Math.random()*((100)+1));

        for (int i=0; i<TimesToAdd; i++){

            int BeersToAdd = 1+(int)(Math.random()*((100)+1));

            if((BeersToAdd + beerHouse.getStock()) >= 100){
                try{
                    BeerProducter.sleep(TimesToAdd);
                }catch (Exception e) { e.printStackTrace(); }
            }
            else{
                BeersAdds += BeersToAdd;
                System.out.println("productor:");
                System.out.println("Stock actual :" +beerHouse.getStock());
                System.out.println("Cervezas producidas :" +BeersToAdd);
                System.out.println("---------------------------");
                beerHouse.BeerAdd(BeersToAdd);
            }
         notifyAll();
        }
        System.out.println("Cervezas producidas :" +BeersAdds);
    }


}
