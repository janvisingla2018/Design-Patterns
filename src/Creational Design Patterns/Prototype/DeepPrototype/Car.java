package DeepPrototype;

public class Car implements Cloneable {
    String model;
    Tyre tyre;

    Car(String model, Tyre tyre) {
        this.model = model;
        this.tyre = tyre;
    }

    protected Car clone() throws CloneNotSupportedException {
        return new Car(this.model, tyre.clone());
    }

    @Override
    public String toString() {
        return "Deep Car{" +
                "model='" + model + '\'' +
                "," + tyre +
                '}';
    }
}
