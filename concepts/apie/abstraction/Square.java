public class Square extends Shape {

    @Override
    public double computeArea() {
        return length*length;
    }

    @Override
    public double computePerimeter() {
        return 4*length;
    }

    @Override
    public double computeVolume() {
        return Math.pow(length, 2)*height;
    }
    
}
