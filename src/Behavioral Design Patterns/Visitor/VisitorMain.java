import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new StandardRoom(100, 3));
        rooms.add(new DeluxeRoom(200, 2, true));
        rooms.add(new StandardRoom(120, 1));

        // Apply Billing Visitor
        BillingVisitor billingVisitor = new BillingVisitor();
        for (Room room : rooms) {
            room.accept(billingVisitor);
        }
        System.out.println("Total Hotel Bill: $" + billingVisitor.getTotalCost());

        System.out.println("\nPerforming Maintenance Check...");
        // Apply Maintenance Visitor
        MaintainanceVisitor maintainanceVisitor = new MaintainanceVisitor();
        for (Room room : rooms) {
            room.accept(maintainanceVisitor);
        }
    }
}
