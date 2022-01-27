package mr223_assign1;
public class Passenger {
    public int passengers = 0;
    public int priceForPassengersWithVehicle = 25;
    Passenger(int p){
        setPassengers(p);
        setPriceForPassengersWithVehicle(p);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPriceForPassengersWithVehicle() {
        return priceForPassengersWithVehicle;
    }

    public void setPriceForPassengersWithVehicle(int priceForPassengersWithVehicle) {
        priceForPassengersWithVehicle *= priceForPassengersWithVehicle;
    }
}


