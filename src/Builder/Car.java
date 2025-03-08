public class Car {
    private String engine;
    private int wheels;
    private String color;
    private boolean sunroof;

     Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                '}';
    }
}