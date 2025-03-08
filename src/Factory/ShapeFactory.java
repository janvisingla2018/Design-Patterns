public class ShapeFactory {
    public Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case Constants.CIRCLE:
                shape = new Circle();
                break;
            case Constants.RECTANGLE:
                shape = new Rectangle();
                break;
            case Constants.SQUARE:
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }
}
