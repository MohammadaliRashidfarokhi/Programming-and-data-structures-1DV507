package mr223_assign1;

public class Square extends Rectangle {
    private double side;



    public Square(String shapeName, double side) {
        super(shapeName,side,side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return (side+side+side+side);
    }

}
