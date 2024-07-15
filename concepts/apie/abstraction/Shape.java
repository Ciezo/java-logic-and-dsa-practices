
public abstract class Shape {

    protected double length;
    protected double width;
    protected double height;
    protected double volume;

    public abstract double computeArea();
    public abstract double computePerimeter();
    public abstract double computeVolume();


    public String toString() {
        // Output: <length> <width> <height> <volume>
        String str = "";
        str = String.valueOf(length);
        str = " " + String.valueOf(width);
        str = " " + String.valueOf(height);
        str = " " + String.valueOf(volume);

        return str;
    }
}
