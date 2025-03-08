package DeepPrototype;

public class DeepPrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("PB", new Tyre("Hyundai"));
        Car car2 = car1.clone();

        System.out.println(car1);
        System.out.println(car2);
    }
}
