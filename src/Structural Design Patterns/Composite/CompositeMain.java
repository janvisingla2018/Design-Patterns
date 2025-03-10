public class CompositeMain {
    public static void main(String[] args) {
        File file1 = new File("Document.pdf");
        File file2 = new File("Photo.jpg");

        Folder folder1 = new Folder("My Folder");
        folder1.add(file1);
        folder1.add(file2);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(folder1);
        rootFolder.add(new File("Notes.txt"));

        rootFolder.showDetails();
    }
}
