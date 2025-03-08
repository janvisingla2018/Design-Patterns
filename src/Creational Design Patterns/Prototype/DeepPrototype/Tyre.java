package DeepPrototype;

public class Tyre implements Cloneable {
    String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "" +
                "brand='" + brand + '\'';
    }

    protected Tyre clone() throws CloneNotSupportedException {
        return new Tyre(brand);
    }
}
