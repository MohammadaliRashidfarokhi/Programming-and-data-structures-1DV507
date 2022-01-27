package mr223_assign1;
public class Lorry extends Vehicle {
    Lorry(int passenger){
        setPassenger(passenger);
        setPrice((passenger*20)+300);
        setSpaceOccupied(40);
    }
    public int vehiclePrice() {
        return 300;
    }
    public int passengersPrice() {
        return 20;
    }
}
