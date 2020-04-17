import Model.Viking;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        Viking v1 = new Viking("Ragnar",40,84,7);
        Viking v2 = new Viking("Bjorn",23,91,6);
        Viking v3 = new Viking("Rollo",43,105,9);
        ArrayList <Viking> vikings = new ArrayList<Viking>();
        vikings.add(v1);
        vikings.add(v2);
        vikings.add(v3);

        for (Viking v: vikings){
            System.out.println("name:"+v.getName());
        }


    }

}
