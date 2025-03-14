public class MaintainanceVisitor implements Visitor {
    @Override
    public void visit(StandardRoom standardRoom) {
        System.out.println("Standard Room Maintenance: ✅ Checked.");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Deluxe Room Maintenance: ✅ Checked.");
        if (deluxeRoom.hasJacuzzi()) {
            System.out.println("Jacuzzi Maintenance: 🔧 Needs extra check.");
        }
    }
}
