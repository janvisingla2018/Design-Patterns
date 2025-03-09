public class SugarDecorator implements Coffee{
    Coffee decoratedCoffee;
    public SugarDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 10.0;
    }
}