public class MilkDecorator implements Coffee {
    Coffee decoratedCoffee;
    public MilkDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 20.0;
    }
}