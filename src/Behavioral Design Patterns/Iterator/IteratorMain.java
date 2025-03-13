public class IteratorMain {
    public static void main(String[] args) {
        NamedCollection namedCollection = new NamedCollection();
        Iterator iterator = namedCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
