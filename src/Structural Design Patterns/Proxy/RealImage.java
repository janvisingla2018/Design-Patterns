public class RealImage implements Image {
    private String filename;

    RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image");
    }
}
