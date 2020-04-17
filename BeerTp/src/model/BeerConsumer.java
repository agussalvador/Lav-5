package model;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class BeerConsumer extends Thread implements Runnable{
    //attributes
    private BeerHouse beerHouse;
    //constructor
    public BeerConsumer(BeerHouse b1) {
        this.beerHouse = b1;
    }

    @Override
    public synchronized void run() {
        int BeersDeleted = 0;
        int TimesToDelete =  1+(int)(Math.random()*((100)+1));

        for (int i=0; i<TimesToDelete; i++){
            int BeersToDelete = 1+(int)(Math.random()*((100)+1));
            if((beerHouse.getStock()) == 0 && beerHouse.getStock()< BeersToDelete){
                try{
                    BeerConsumer.sleep(TimesToDelete);
                }catch (InterruptedException e) { e.printStackTrace(); }
            }
            else{
                BeersDeleted += BeersToDelete;
                System.out.println("consumidor:");
                System.out.println("Stock actual :" +beerHouse.getStock());
                System.out.println("Cervezas consumidas :" +BeersToDelete);
                System.out.println("---------------------------");
                beerHouse.BeerDelete(BeersToDelete);
            }
            notifyAll();
        }

        //System.out.println("tu puta madre");
        System.out.println("Cervezas consumidas :" +BeersDeleted);
    }

}
