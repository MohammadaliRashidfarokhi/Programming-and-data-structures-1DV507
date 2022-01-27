package mr223_assign1;

public class Car extends Vehicle {
    Car(int passenger){
        setPassenger(passenger);
        setPrice((passenger*20)+100);
        setSpaceOccupied(5);
    }
    public int vehiclePrice() {
        return 100;
    }

    public int passengersPrice() {
        return 20;
    }
}
