/**
 * <p>
 * Abstract classes are different from interfaces because they need
 * to be extended by a subclass. Properties, fields, and methods
 * are inherited by the child class once an abstract class is inherited 
 * </p>
 */
public class Rectangle extends Shape {

    /*
     * Here we can use the properties of Shape such as the following: 
     * 
     * Shape.length;
     * Shape.width;
     * Shape.height;
     * Shape.volume;
     * 
     * And, these are attributes inherited by the Rectangle class
     * once it has extended the abstract class, Shape.
     * 
     * 
     * The Rectangle class provides different implementations of 
     * the Shape methods(). All of which are different formulas for the 
     * computation of area, perimeter, and volume for a Rectangle
     */

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
