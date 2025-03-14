public class BillingVisitor implements Visitor {
    private int totalCost = 0;

    @Override
    public void visit(StandardRoom standardRoom) {
        int cost = standardRoom.getCostPerNight() * standardRoom.getNights();
        System.out.println("Standard Room Cost: $" + cost);
        totalCost += cost;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        int cost = deluxeRoom.getCostPerNight() * deluxeRoom.getNights();
        if (deluxeRoom.hasJacuzzi()) {
            cost += 50; // Extra charge for Jacuzzi
        }
        System.out.println("Deluxe Room Cost: $" + cost);
        totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
