public class StandardRoom implements Room {
    private int costPerNight;
    private int nights;

    public StandardRoom(int costPerNight, int nights) {
        this.costPerNight = costPerNight;
        this.nights = nights;
    }

    public int getCostPerNight() {
        return costPerNight;
    }

    public int getNights() {
        return nights;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
