public class DeluxeRoom implements Room {
    private int costPerNight;
    private int nights;
    private boolean hasJacuzzi;

    public DeluxeRoom(int costPerNight, int nights, boolean hasJacuzzi) {
        this.costPerNight = costPerNight;
        this.nights = nights;
        this.hasJacuzzi = hasJacuzzi;
    }

    public int getCostPerNight() {
        return costPerNight;
    }

    public int getNights() {
        return nights;
    }

    public boolean hasJacuzzi() {
        return hasJacuzzi;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
