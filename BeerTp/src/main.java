import model.BeerConsumer;
import model.BeerHouse;
import model.BeerProducter;

public class main {
    public static void main(String[] args) {
        BeerHouse cheverry = new BeerHouse(0);

        BeerProducter p1 = new BeerProducter(cheverry);

        BeerConsumer c1 = new BeerConsumer(cheverry);
        BeerConsumer c2 = new BeerConsumer(cheverry);
        BeerConsumer c3 = new BeerConsumer(cheverry);

        p1.start();
        c1.start();
        //c2.start();
        // c3.start();
    }
}
