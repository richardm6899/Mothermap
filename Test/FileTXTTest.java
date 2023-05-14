import org.junit.Test;
import static org.junit.Assert.*;

public class FileTXTTest {

    @Test
    public void testGetName() {
        FileTXT file = new FileTXT("myFile");
        assertEquals("myFile.txt", file.getName());
    }

    @Test
    public void testSetName() {
        FileTXT file = new FileTXT("myFile");
        file.setName("newName");
        assertEquals("newName.txt", file.getName());
    }

    @Test
    public void testDefineFile() {
        FileTXT file = new FileTXT("myFile");
        file.defineFile("this is a test");
        assertEquals("TxT file: this is a test", file.getDescription());
    }
}
