public class NamedCollection implements Collection {
    @Override
    public Iterator iterator() {
        return new NamedIterator();
    }

    class NamedIterator implements Iterator {
        private String[] names = {"Alice", "Bob", "Charlie", "David"};
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if(hasNext())
                return names[index++];
            return null;
        }
    }
}
