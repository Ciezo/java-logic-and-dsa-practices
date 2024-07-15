public class Rectangle extends Shape {

    @Override
    public double computeArea() {
        return length*width;
    }

    @Override
    public double computePerimeter() {
        return 2*(length + width);
    }

    @Override
    public double computeVolume() {
        return length*width*height;
    }
    
}
