public class BuilderMain {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setColor("Red")
                .setSunroof(false)
                .build();

        System.out.println(car.toString());
    }
}
