package mr223_assign1;


public class Bicycle extends Vehicle {
    Bicycle(int passenger){
        setPassenger(passenger);
        setPrice(40);
        setSpaceOccupied(1);
    }
    public int vehiclePrice() {
        return 40;
    }

    public int passengersPrice() {
        return 0;
    }

}

