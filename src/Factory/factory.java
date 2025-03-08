public class factory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(Constants.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(Constants.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShape(Constants.SQUARE);
        square.draw();
    }
}

//Encapsulates object creation logic
//Loose coupling (Reduces direct dependency on specific classes)
//Easier to add new types without modifying existing code