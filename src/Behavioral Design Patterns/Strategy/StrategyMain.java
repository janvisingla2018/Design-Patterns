import java.util.Random;

public class StrategyMain {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();

        int[] smallData = {5, 2, 9, 1, 5, 6};
        int[] mediumData = new Random().ints(50, 1, 100).toArray();
        int[] largeData = new Random().ints(200, 1, 1000).toArray();

        System.out.println("\nSorting Small Array:");
        context.executeSorting(smallData.clone());

        System.out.println("\nSorting Medium Array:");
        context.executeSorting(mediumData.clone());

        System.out.println("\nSorting Large Array:");
        context.executeSorting(largeData.clone());
    }
}
