package mr223_assign1;

import java.util.ArrayList;
import java.util.Iterator;

public class FerryController implements Ferry{
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    private final int MAX_SPACE = 500;
    private int moneyStored = 0;

    @Override
    public int countPassengers() {
        int aux= 0;
        for (Passenger passenger : passengers) {
            aux += passenger.getPassengers();
        }

        for (Vehicle vehicle : vehicles) {
            aux += vehicle.getPassenger();
        }

        return aux;
    }

    @Override
    public int countVehicleSpace() {
        int aux = 0;
        for (Vehicle v:vehicles )
            aux+=v.getSpaceOccupied();

        return MAX_SPACE-aux;
    }

    @Override
    public int countMoney() {
        int aux = moneyStored;

        for (Vehicle v : vehicles) {
            aux += v.getPrice();
        }

        for (Passenger p : passengers) {
            aux += p.getPriceForPassengersWithVehicle();
        }
        return aux;
    }


    @Override
    public Vehicle[] getAllVehicles() {
        Vehicle[] retrieve = new Vehicle[vehicles.size()];
        for (int i = 0; i < vehicles.size(); i++) {
            retrieve [i] = vehicles.get(i);
        }
        return retrieve;
    }

    @Override
    public void disembark() {
        moneyStored=countMoney();
        vehicles.clear();
        passengers.clear();



    }


    @Override
    public boolean hasRoomFor(Passenger p) {
        return this.countPassengers()>= p.getPassengers();
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        return this.countVehicleSpace() >= v.getSpaceOccupied();
    }

    public Iterator<Vehicle> iterator() {
        return vehicles.iterator();
    }


    @Override
    public void embark(Passenger p) throws  Exception{
        if (!passengers.contains(p)){
            if (hasRoomFor(p)){
                passengers.add(p);
                countMoney();
            }else{
                throw new Exception("There is no Room ");
            }
        }

    }

    @Override
    public void embark(Vehicle v) throws Exception {
        if(!vehicles.contains(v)) {
            if (hasSpaceFor(v)) {
                vehicles.add(v);
                countMoney();
            } else {
                throw new Exception("There is no space");
            }
        }else {
            throw new Exception("The vehicle is already in the garage");
        }

    }

    @Override
    public String toString() {
        return "====Ferry====\n"+
                "Available space:"+countVehicleSpace()+"\n"+
                "Number of vehicles:"+vehicles.size()+"\n"+
                "Number of Passengers:"+countPassengers()+"\n"+
                "Money in the ferry:"+countMoney()+"\n";
    }
}