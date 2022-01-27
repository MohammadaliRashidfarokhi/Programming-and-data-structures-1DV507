package mr223_assign1;

public class Rectangle extends Shape {

    private double height;
    private double width ;

    public Rectangle(String ShapeName) {
        super(ShapeName);
    }

    public Rectangle(String shapeName, double height, double width) {
        super(shapeName);
        this.height = height;
        this.width = width;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height + width + height);
    }
}



