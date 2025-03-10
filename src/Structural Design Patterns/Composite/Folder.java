import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    String name;
    List<FileSystem> items;

    public Folder(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public void add(FileSystem item) {
        items.add(item);
    }

    public void remove(FileSystem item) {
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for(FileSystem item : items) {
            item.showDetails();
        }
    }
}
