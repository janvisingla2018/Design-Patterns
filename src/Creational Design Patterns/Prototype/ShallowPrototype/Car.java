package ShallowPrototype;

public class Car implements Cloneable {
    private String model;
    private Tyre tyre;

    public Car(String model, Tyre tyre) {
        this.model = model;
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Shallow Car{" +
                "model='" + model + '\'' +
                "," + tyre.toString() +
                '}';
    }

    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
