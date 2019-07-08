package Factory;

public class ShapeFactory {

    public static String circle = "Circle";
    public static String Square = "Square";

    public static Shape getShape(String shape) {
        if (shape.equalsIgnoreCase(ShapeFactory.Square)) {
            return new Square();
        } else if (shape.equalsIgnoreCase(ShapeFactory.circle)) {
            return new Circle();
        } else {
            return new Circle();
        }
    }
}
