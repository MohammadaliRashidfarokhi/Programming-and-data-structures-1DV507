package mr223_assign1;

public class Bus extends Vehicle {
    Bus(int passenger){
        setPassenger(passenger);
        setPrice((passenger*15)+200);
        setSpaceOccupied(20);
    }
    public int vehiclePrice() {
        return 200;
    }

    public int passengersPrice() {
        return 15;
    }

}
