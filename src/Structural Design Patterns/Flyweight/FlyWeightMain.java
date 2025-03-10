public class FlyWeightMain {
    public static void main(String[] args) {
        TreeType oakType = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType pineType = TreeFactory.getTreeType("Pine", "Dark Green", "Smooth");

        Tree tree1 = new Tree(10, 20, oakType);
        Tree tree2 = new Tree(15, 30, oakType); // Reuses Oak type
        Tree tree3 = new Tree(50, 60, pineType);
        Tree tree4 = new Tree(55, 65, pineType); // Reuses Pine type

        tree1.draw();
        tree2.draw();
        tree3.draw();
        tree4.draw();
    }
}
