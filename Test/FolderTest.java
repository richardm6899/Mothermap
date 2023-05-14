import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class FolderTest {

    @Test
    public void testGetSetFiles() {
        Folder folder = new Folder("myFolder");
        ArrayList<File> files = new ArrayList<File>();
        files.add(new FilePNG("file1"));
        files.add(new FileDoc("file2"));
        folder.setFiles(files);
        assertEquals(files, folder.getFiles());
    }
}
