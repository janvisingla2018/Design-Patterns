public class SortingContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(int []arr) {
        int size = arr.length;
        if (size <= 10)
            sortingStrategy = new BubbleSort();
        else if (size > 10 && size <= 100)
            sortingStrategy = new QuickSort();
        else
            sortingStrategy = new MergeSort();
    }

    public void executeSorting(int[] arr) {
        setSortingStrategy(arr);
        sortingStrategy.sort(arr);
    }
}
