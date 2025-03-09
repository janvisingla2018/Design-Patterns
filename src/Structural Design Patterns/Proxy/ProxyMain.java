public class ProxyMain {
    public static void main(String[] args) {
        ProxyImage img = new ProxyImage("https://www.google.com");
        img.display();
        img.display();
        img.display();
    }
}
