package mr223_assign1;

import java.util.Iterator;

public class FerryMain {
    public static void main(String[] args) throws Exception {
        FerryController ferry = new FerryController();
        try {
            ferry.embark(new Bicycle(1));
            System.out.println(ferry.toString());
            ferry.embark(new Car(4));
            System.out.println(ferry.toString());
            Bus bus = new Bus(20);
            ferry.embark(bus);
            System.out.println(ferry.toString());

            //ferry.embark(bus); // Run exception

            ferry.disembark();
            System.out.println(ferry.toString());


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
