import org.junit.Test;
import static org.junit.Assert.*;

public class FilePNGTest {

    @Test
    public void testDefineFile() {
        FilePNG file = new FilePNG("myFile");
        file.defineFile("testDescription");
        assertEquals("PNG file: testDescription.", file.getDescription());
    }

    @Test
    public void testGetName() {
        FilePNG file = new FilePNG("myFile");
        assertEquals("myFile.png", file.getName());
    }
}
