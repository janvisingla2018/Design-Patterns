package ShallowPrototype;

public class ShallowPrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("PB", new Tyre("Creta"));
        Car car2 = car1.clone();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
