import java.util.ArrayList;
public class Folder {
    private String name;

    private ArrayList<? extends File> files;

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<? extends File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<? extends File> files) {
        this.files = files;
    }
}
