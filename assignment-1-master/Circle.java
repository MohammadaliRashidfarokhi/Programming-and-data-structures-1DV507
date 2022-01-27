package mr223_assign1;
    public class Circle extends Shape {

        private double radius;

        public Circle (String shapeName, double radius) {
            super(shapeName);
            this.radius =radius ;
        }
        public Circle(String shapeName){
            super(shapeName);
        }

        public double getRadius()
        {
            return radius;
        }
        public void setRadius(int radius)
        {
            this.radius = radius;
        }

        public double getArea() {
            if (this.radius==0){
                return 0;
            }
            return this.radius*this.radius*Math.PI;
        }

        public double getPerimeter(){
            return (Math.PI *2* radius);
        }
    }
