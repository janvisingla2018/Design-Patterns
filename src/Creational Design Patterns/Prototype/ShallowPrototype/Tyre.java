package ShallowPrototype;

public class Tyre {
    String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "" +
                "brand='" + brand + '\'';
    }
}
