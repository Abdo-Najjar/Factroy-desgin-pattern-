package Factory;

public class FactoryDome {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeFactory.circle);
        Shape square = ShapeFactory.getShape(ShapeFactory.Square);
        circle.draw();
        square.draw();
    }
}
