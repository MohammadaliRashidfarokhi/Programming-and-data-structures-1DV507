package mr223_assign1;


public class Vehicle {
    private int price;
    private int spaceOccupied;
    private int passenger;
    private int feeWithoutPassenger = 0;

    Vehicle() {

    }

    Vehicle(int price, int spaceOccupied, int passenger, int feeWithoutPassenger){
        this.price =price;
        this.spaceOccupied = spaceOccupied;
        this.passenger = passenger;
        this.feeWithoutPassenger =feeWithoutPassenger;
    }

    public int getPrice() {
        return price;
    }

    public int getFeeWithoutPassenger() {
        return feeWithoutPassenger;
    }

    public void setFeeWithoutPassenger(int feeWithoutPassenger) {
        this.feeWithoutPassenger = feeWithoutPassenger;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpaceOccupied() {
        return spaceOccupied;
    }

    public void setSpaceOccupied(int spaceOccupied) {
        this.spaceOccupied = spaceOccupied;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}
